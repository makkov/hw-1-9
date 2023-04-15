package com.skypro;

public class Main {

    public static void main(String[] args) {

        Author lermontov = new Author("Mikhail", "Lermontov");
        Author pushkin = new Author("Alexander", "Pushkin");

        Book geroyNashegoVremeni = new Book("Geroy nashego vremeni", lermontov, 2020);
        Book ruslanILydmila = new Book("Ruslan i Lydmila", pushkin, 2001);

        System.out.println("geroyNashegoVremeni:");
        System.out.println(geroyNashegoVremeni.getName());
        System.out.println(geroyNashegoVremeni.getAuthor().getName() + " " + geroyNashegoVremeni.getAuthor().getSurname());
        System.out.println(geroyNashegoVremeni.getYear());

        System.out.println();

        System.out.println("ruslanILydmila:");
        System.out.println(ruslanILydmila.getName());
        System.out.println(ruslanILydmila.getAuthor().getName() + " " + ruslanILydmila.getAuthor().getSurname());
        System.out.println(ruslanILydmila.getYear());

        System.out.println();

        geroyNashegoVremeni.setYear(2007);
        System.out.println("год издания geroyNashegoVremeni " + geroyNashegoVremeni.getYear());
    }
}
