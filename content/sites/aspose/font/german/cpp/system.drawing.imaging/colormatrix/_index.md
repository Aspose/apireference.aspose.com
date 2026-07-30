---
title: "System::Drawing::Imaging::ColorMatrix class"
linktitle: "ColorMatrix"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Imaging::ColorMatrix class. Stellt eine 5x5-Matrix dar, die die Koordinaten für den RGBAW-Farbraum enthält. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.drawing.imaging/colormatrix/
---
## ColorMatrix class


Stellt eine 5x5-Matrix dar, die die Koordinaten für den RGBAW-Farbraum enthält. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class ColorMatrix : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ColorMatrix](./colormatrix/)() | Konstruiert eine neue Instanz der Klasse [ColorMatrix](./) und initialisiert sie mit den Werten der Einheitsmatrix. |
| [ColorMatrix](./colormatrix/)(const System::ArrayPtr\<System::ArrayPtr\<float\>\>\&) | Konstruiert eine neue Instanz der Klasse [ColorMatrix](./) und initialisiert sie mit den angegebenen Werten. |
| [get_Matrix00](./get_matrix00/)() const | Gibt einen Wert in Zeile 0 und Spalte 0 zurück. |
| [get_Matrix01](./get_matrix01/)() const | Gibt einen Wert in Zeile 0 und Spalte 1 zurück. |
| [get_Matrix02](./get_matrix02/)() const | Gibt einen Wert in Zeile 0 und Spalte 2 zurück. |
| [get_Matrix03](./get_matrix03/)() const | Gibt einen Wert in Zeile 0 und Spalte 3 zurück. |
| [get_Matrix04](./get_matrix04/)() const | Gibt einen Wert in Zeile 0 und Spalte 4 zurück. |
| [get_Matrix10](./get_matrix10/)() const | Gibt einen Wert in Zeile 1 und Spalte 0 zurück. |
| [get_Matrix11](./get_matrix11/)() const | Gibt einen Wert in Zeile 1 und Spalte 1 zurück. |
| [get_Matrix12](./get_matrix12/)() const | Gibt einen Wert in Zeile 1 und Spalte 2 zurück. |
| [get_Matrix13](./get_matrix13/)() const | Gibt einen Wert in Zeile 1 und Spalte 3 zurück. |
| [get_Matrix14](./get_matrix14/)() const | Gibt einen Wert in Zeile 1 und Spalte 4 zurück. |
| [get_Matrix20](./get_matrix20/)() const | Gibt einen Wert in Zeile 2 und Spalte 0 zurück. |
| [get_Matrix21](./get_matrix21/)() const | Gibt einen Wert in Zeile 2 und Spalte 1 zurück. |
| [get_Matrix22](./get_matrix22/)() const | Gibt einen Wert in Zeile 2 und Spalte 2 zurück. |
| [get_Matrix23](./get_matrix23/)() const | Gibt einen Wert in Zeile 2 und Spalte 3 zurück. |
| [get_Matrix24](./get_matrix24/)() const | Gibt einen Wert in Zeile 2 und Spalte 4 zurück. |
| [get_Matrix30](./get_matrix30/)() const | Gibt einen Wert in Zeile 3 und Spalte 0 zurück. |
| [get_Matrix31](./get_matrix31/)() const | Gibt einen Wert in Zeile 3 und Spalte 1 zurück. |
| [get_Matrix32](./get_matrix32/)() const | Gibt einen Wert in Zeile 3 und Spalte 2 zurück. |
| [get_Matrix33](./get_matrix33/)() const | Gibt einen Wert in Zeile 3 und Spalte 3 zurück. |
| [get_Matrix34](./get_matrix34/)() const | Gibt einen Wert in Zeile 3 und Spalte 4 zurück. |
| [get_Matrix40](./get_matrix40/)() const | Gibt einen Wert in Zeile 4 und Spalte 0 zurück. |
| [get_Matrix41](./get_matrix41/)() const | Gibt einen Wert in Zeile 4 und Spalte 1 zurück. |
| [get_Matrix42](./get_matrix42/)() const | Gibt einen Wert in Zeile 4 und Spalte 2 zurück. |
| [get_Matrix43](./get_matrix43/)() const | Gibt einen Wert in Zeile 4 und Spalte 3 zurück. |
| [get_Matrix44](./get_matrix44/)() const | Gibt einen Wert in Zeile 4 und Spalte 4 zurück. |
| [idx_get](./idx_get/)(int, int) | Gibt einen Wert in der angegebenen Zeile und Spalte zurück. |
| [idx_set](./idx_set/)(int, int, float) | Setzt den angegebenen Wert an der angegebenen Position in der Matrix. |
| [set_Matrix00](./set_matrix00/)(float) | Setzt einen Wert in Zeile 0 und Spalte 0. |
| [set_Matrix01](./set_matrix01/)(float) | Setzt einen Wert in Zeile 0 und Spalte 1. |
| [set_Matrix02](./set_matrix02/)(float) | Setzt einen Wert in Zeile 0 und Spalte 2. |
| [set_Matrix03](./set_matrix03/)(float) | Setzt einen Wert in Zeile 0 und Spalte 3. |
| [set_Matrix04](./set_matrix04/)(float) | Setzt einen Wert in Zeile 0 und Spalte 4. |
| [set_Matrix10](./set_matrix10/)(float) | Setzt einen Wert in Zeile 1 und Spalte 0. |
| [set_Matrix11](./set_matrix11/)(float) | Setzt einen Wert in die 1. Zeile und 1. Spalte. |
| [set_Matrix12](./set_matrix12/)(float) | Setzt einen Wert in die 1. Zeile und 2. Spalte. |
| [set_Matrix13](./set_matrix13/)(float) | Setzt einen Wert in die 1. Zeile und 3. Spalte. |
| [set_Matrix14](./set_matrix14/)(float) | Setzt einen Wert in die 1. Zeile und 4. Spalte. |
| [set_Matrix20](./set_matrix20/)(float) | Setzt einen Wert in die 2. Zeile und 0. Spalte. |
| [set_Matrix21](./set_matrix21/)(float) | Setzt einen Wert in die 2. Zeile und 1. Spalte. |
| [set_Matrix22](./set_matrix22/)(float) | Setzt einen Wert in die 2. Zeile und 2. Spalte. |
| [set_Matrix23](./set_matrix23/)(float) | Setzt einen Wert in die 2. Zeile und 3. Spalte. |
| [set_Matrix24](./set_matrix24/)(float) | Setzt einen Wert in die 2. Zeile und 4. Spalte. |
| [set_Matrix30](./set_matrix30/)(float) | Setzt einen Wert in die 3. Zeile und 0. Spalte. |
| [set_Matrix31](./set_matrix31/)(float) | Setzt einen Wert in die 3. Zeile und 1. Spalte. |
| [set_Matrix32](./set_matrix32/)(float) | Setzt einen Wert in die 3. Zeile und 2. Spalte. |
| [set_Matrix33](./set_matrix33/)(float) | Setzt einen Wert in die 3. Zeile und 3. Spalte. |
| [set_Matrix34](./set_matrix34/)(float) | Setzt einen Wert in die 3. Zeile und 4. Spalte. |
| [set_Matrix40](./set_matrix40/)(float) | Setzt einen Wert in die 4. Zeile und 0. Spalte. |
| [set_Matrix41](./set_matrix41/)(float) | Setzt einen Wert in die 4. Zeile und 1. Spalte. |
| [set_Matrix42](./set_matrix42/)(float) | Setzt einen Wert in die 4. Zeile und 2. Spalte. |
| [set_Matrix43](./set_matrix43/)(float) | Setzt einen Wert in die 4. Zeile und 3. Spalte. |
| [set_Matrix44](./set_matrix44/)(float) | Setzt einen Wert in die 4. Zeile und 4. Spalte. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
