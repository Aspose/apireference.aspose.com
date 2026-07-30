---
title: "System::Drawing::Imaging::ColorMatrix class"
linktitle: "ColorMatrix"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Imaging::ColorMatrix class. Rappresenta una matrice 5x5 che contiene le coordinate per lo spazio colore RGBAW. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.drawing.imaging/colormatrix/
---
## ColorMatrix class


Rappresenta una matrice 5x5 che contiene le coordinate per lo spazio colore RGBAW. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class ColorMatrix : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ColorMatrix](./colormatrix/)() | Costruisce una nuova istanza della classe [ColorMatrix](./) e la inizializza con i valori della matrice identità. |
| [ColorMatrix](./colormatrix/)(const System::ArrayPtr\<System::ArrayPtr\<float\>\>\&) | Costruisce una nuova istanza della classe [ColorMatrix](./) e la inizializza con i valori specificati. |
| [get_Matrix00](./get_matrix00/)() const | Restituisce un valore nella riga 0 e nella colonna 0. |
| [get_Matrix01](./get_matrix01/)() const | Restituisce un valore nella riga 0 e nella colonna 1. |
| [get_Matrix02](./get_matrix02/)() const | Restituisce un valore nella riga 0 e nella colonna 2. |
| [get_Matrix03](./get_matrix03/)() const | Restituisce un valore nella riga 0 e nella colonna 3. |
| [get_Matrix04](./get_matrix04/)() const | Restituisce un valore nella riga 0 e nella colonna 4. |
| [get_Matrix10](./get_matrix10/)() const | Restituisce un valore nella riga 1 e nella colonna 0. |
| [get_Matrix11](./get_matrix11/)() const | Restituisce un valore nella riga 1 e nella colonna 1. |
| [get_Matrix12](./get_matrix12/)() const | Restituisce un valore nella riga 1 e nella colonna 2. |
| [get_Matrix13](./get_matrix13/)() const | Restituisce un valore nella prima riga e nella terza colonna. |
| [get_Matrix14](./get_matrix14/)() const | Restituisce un valore nella prima riga e nella quarta colonna. |
| [get_Matrix20](./get_matrix20/)() const | Restituisce un valore nella seconda riga e nella prima colonna. |
| [get_Matrix21](./get_matrix21/)() const | Restituisce un valore nella seconda riga e nella seconda colonna. |
| [get_Matrix22](./get_matrix22/)() const | Restituisce un valore nella seconda riga e nella terza colonna. |
| [get_Matrix23](./get_matrix23/)() const | Restituisce un valore nella seconda riga e nella quarta colonna. |
| [get_Matrix24](./get_matrix24/)() const | Restituisce un valore nella seconda riga e nella quinta colonna. |
| [get_Matrix30](./get_matrix30/)() const | Restituisce un valore nella terza riga e nella prima colonna. |
| [get_Matrix31](./get_matrix31/)() const | Restituisce un valore nella terza riga e nella seconda colonna. |
| [get_Matrix32](./get_matrix32/)() const | Restituisce un valore nella terza riga e nella terza colonna. |
| [get_Matrix33](./get_matrix33/)() const | Restituisce un valore nella terza riga e nella quarta colonna. |
| [get_Matrix34](./get_matrix34/)() const | Restituisce un valore nella terza riga e nella quinta colonna. |
| [get_Matrix40](./get_matrix40/)() const | Restituisce un valore nella quarta riga e nella prima colonna. |
| [get_Matrix41](./get_matrix41/)() const | Restituisce un valore nella quarta riga e nella seconda colonna. |
| [get_Matrix42](./get_matrix42/)() const | Restituisce un valore nella quarta riga e nella terza colonna. |
| [get_Matrix43](./get_matrix43/)() const | Restituisce un valore nella quarta riga e nella quarta colonna. |
| [get_Matrix44](./get_matrix44/)() const | Restituisce un valore nella quarta riga e nella quinta colonna. |
| [idx_get](./idx_get/)(int, int) | Restituisce un valore nella riga e nella colonna specificate. |
| [idx_set](./idx_set/)(int, int, float) | Imposta il valore specificato nella posizione indicata nella matrice. |
| [set_Matrix00](./set_matrix00/)(float) | Imposta un valore nella riga 0 e nella colonna 0. |
| [set_Matrix01](./set_matrix01/)(float) | Imposta un valore nella riga 0 e nella colonna 1. |
| [set_Matrix02](./set_matrix02/)(float) | Imposta un valore nella riga 0 e nella colonna 2. |
| [set_Matrix03](./set_matrix03/)(float) | Imposta un valore nella riga 0 e nella colonna 3. |
| [set_Matrix04](./set_matrix04/)(float) | Imposta un valore nella riga 0 e nella colonna 4. |
| [set_Matrix10](./set_matrix10/)(float) | Imposta un valore nella prima riga e nella colonna 0. |
| [set_Matrix11](./set_matrix11/)(float) | Imposta un valore nella riga 1 e nella colonna 1. |
| [set_Matrix12](./set_matrix12/)(float) | Imposta un valore nella riga 1 e nella colonna 2. |
| [set_Matrix13](./set_matrix13/)(float) | Imposta un valore nella riga 1 e nella colonna 3. |
| [set_Matrix14](./set_matrix14/)(float) | Imposta un valore nella riga 1 e nella colonna 4. |
| [set_Matrix20](./set_matrix20/)(float) | Imposta un valore nella riga 2 e nella colonna 0. |
| [set_Matrix21](./set_matrix21/)(float) | Imposta un valore nella riga 2 e nella colonna 1. |
| [set_Matrix22](./set_matrix22/)(float) | Imposta un valore nella riga 2 e nella colonna 2. |
| [set_Matrix23](./set_matrix23/)(float) | Imposta un valore nella riga 2 e nella colonna 3. |
| [set_Matrix24](./set_matrix24/)(float) | Imposta un valore nella riga 2 e nella colonna 4. |
| [set_Matrix30](./set_matrix30/)(float) | Imposta un valore nella riga 3 e nella colonna 0. |
| [set_Matrix31](./set_matrix31/)(float) | Imposta un valore nella riga 3 e nella colonna 1. |
| [set_Matrix32](./set_matrix32/)(float) | Imposta un valore nella riga 3 e nella colonna 2. |
| [set_Matrix33](./set_matrix33/)(float) | Imposta un valore nella riga 3 e nella colonna 3. |
| [set_Matrix34](./set_matrix34/)(float) | Imposta un valore nella riga 3 e nella colonna 4. |
| [set_Matrix40](./set_matrix40/)(float) | Imposta un valore nella riga 4 e nella colonna 0. |
| [set_Matrix41](./set_matrix41/)(float) | Imposta un valore nella riga 4 e nella colonna 1. |
| [set_Matrix42](./set_matrix42/)(float) | Imposta un valore nella riga 4 e nella colonna 2. |
| [set_Matrix43](./set_matrix43/)(float) | Imposta un valore nella riga 4 e nella colonna 3. |
| [set_Matrix44](./set_matrix44/)(float) | Imposta un valore nella riga 4 e nella colonna 4. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
