# UserDao
### UserDao to klasa w języku Java, która zarządza operacjami CRUD (Create, Read, Update, Delete) dla obiektów User w bazie danych. Używa do tego celu języka SQL oraz narzędzia BCrypt do haszowania haseł użytkowników.

## Spis treści
- Opis
- Funkcjonalności
- Wymagania
- Autorzy
- Licencja

## Opis
UserDao służy do wykonywania operacji na użytkownikach w bazie danych. Klasa ta obsługuje tworzenie nowych użytkowników, odczyt danych o użytkownikach na podstawie ich identyfikatorów, aktualizację danych użytkowników oraz ich usuwanie. Wszystkie hasła użytkowników są hashowane przy użyciu biblioteki BCrypt.

## Funkcjonalności
- Tworzenie użytkownika: Dodanie nowego użytkownika do bazy danych z zahaszowanym hasłem.
- Odczyt użytkownika: Pobranie danych użytkownika na podstawie jego identyfikatora.
- Aktualizacja użytkownika: Zmiana danych istniejącego użytkownika.
- Usunięcie użytkownika: Usunięcie użytkownika na podstawie jego identyfikatora.
- Wyświetlanie wszystkich użytkowników: Pobranie listy wszystkich użytkowników z bazy danych.

## Wymagania
- Java 8 lub nowsza
- Biblioteka BCrypt do haszowania haseł
- Konfiguracja bazy danych w klasie DbUtil

## Autorzy
- Mateusz Maciejewski
  
## Licencja
- Projekt jest licencjonowany na podstawie licencji MIT
