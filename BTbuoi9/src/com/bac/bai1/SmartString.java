package com.bac.bai1;

import java.util.ArrayList;

public class SmartString {
    private String text;

    public SmartString(String text) {
        this.text = text;
    }

    public ArrayList<News> filter() {
        ArrayList<News> news = new ArrayList<>();
        String Stitle = "<title><![CDATA[";
        String Etitle = "]]></title>";
        String SLinkDetail = "<link><![CDATA[";
        String ELinkDetail = "]]></link>";
        String SLinkImage = "<img src=\"";
        String ELinkImage = "\" /></a>]]>";
        String SDate = "<pubDate><![CDATA[";
        String EDate = "]]></pubDate>";

        String title = "";
        String linkImg = "";
        String linkDetail = "";
        String date = "";

        int indexStitle = text.indexOf(Stitle);
        int indexEtitle = text.indexOf(Etitle);
        int indexSLinkDetail = text.indexOf(SLinkDetail);
        int indexELinkDetail = text.indexOf(ELinkDetail);
        int indexSLinkImage = text.indexOf(SLinkImage);
        int indexELinkImage = text.indexOf(ELinkImage);
        int indexSDate = text.indexOf(SDate);
        int indexEDate = text.indexOf(EDate);

        while (indexStitle != -1) {
            title = text.substring(indexStitle + Stitle.length(), indexEtitle);
            linkDetail = text.substring(indexSLinkDetail + SLinkDetail.length(), indexELinkDetail);
            linkImg = text.substring(indexSLinkImage + SLinkImage.length(), indexELinkImage);
            date = text.substring(indexSDate + SDate.length(), indexEDate);

            News tmp = new News(title, linkDetail, linkImg, date);
            news.add(tmp);
            indexStitle = text.indexOf(Stitle,indexStitle+1);
            indexEtitle = text.indexOf(Etitle,indexEtitle+1);
            indexSLinkDetail = text.indexOf(SLinkDetail,indexSLinkDetail+1);
            indexELinkDetail = text.indexOf(ELinkDetail,indexELinkDetail+1);
            indexSLinkImage = text.indexOf(SLinkImage,indexSLinkImage+1);
            indexELinkImage = text.indexOf(ELinkImage,indexELinkImage+1);
            indexSDate = text.indexOf(SDate,indexSDate+1);
            indexEDate = text.indexOf(EDate,indexEDate+1);
        }

        return news;
    }

    public void inDSThongTin(){
        ArrayList<News> news = filter();
        for (News n:news) {
            n.inThongTin();
            System.out.println("---------------------------");
        }
    }
}
