package ua.lviv.lgs.task14_2;

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println();
		System.out.println("Введите 1, чтобы добавить товар на полку");
		System.out.println("Введите 2, чтобы удалить товар с полки");
		System.out.println("Введите 3, чтобы заменить товар на полке");
		System.out.println("Введите 4, чтобы посортировать товары на полке по их названию");
		System.out.println("Введите 5, чтобы посортировать товары на полке по их длине");
		System.out.println("Введите 6, чтобы посортировать товары на полке по их ширине");
		System.out.println("Введите 7, чтобы посортировать товары на полке по их весу");
		System.out.println("Введите 8, чтобы вывести товар по его порядковому номеру размещения на полке");
		System.out.println("Введите 9, чтобы выйти из программы");
	}

	public static void main(String[] args) {
		Shelf shelf = new Shelf();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			menu();

			switch (scanner.nextInt()) {

			case 1: {
				shelf.addCommodity();
				break;
			}

			case 2: {
				shelf.removeCommodity();
				break;
			}

			case 3: {
				shelf.replaceCommodity();
				break;
			}

			case 4: {
				shelf.sortByName();
				break;
			}

			case 5: {
				shelf.sortByLength();
				break;
			}

			case 6: {
				shelf.sortByWidth();
				break;
			}

			case 7: {
				shelf.sortByWeight();
				break;
			}

			case 8: {
				shelf.getCommodity();
				break;
			}

			case 9: {
				System.exit(0);
				break;
			}

			default: {
				System.out.println("Введите число от 1 до 9!");
				break;
			}
			}
		}

	}

}
