---
title: "System::Drawing::Imaging::ColorMatrix class"
linktitle: "ColorMatrix"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Imaging::ColorMatrix class. Vertegenwoordigt een 5x5 matrix die de coördinaten bevat voor de RGBAW-kleurruimte. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 300
url: /nl/cpp/system.drawing.imaging/colormatrix/
---
## ColorMatrix class


Vertegenwoordigt een 5x5 matrix die de coördinaten bevat voor de RGBAW‑kleurruimte. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ColorMatrix : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ColorMatrix](./colormatrix/)() | Construeert een nieuwe instantie van de [ColorMatrix](./)‑klasse en initialiseert deze met de waarden van de identiteitsmatrix. |
| [ColorMatrix](./colormatrix/)(const System::ArrayPtr\<System::ArrayPtr\<float\>\>\&) | Construeert een nieuwe instantie van de [ColorMatrix](./)‑klasse en initialiseert deze met de opgegeven waarden. |
| [get_Matrix00](./get_matrix00/)() const | Retourneert een waarde in de 0e rij en 0e kolom. |
| [get_Matrix01](./get_matrix01/)() const | Retourneert een waarde in de 0e rij en 1e kolom. |
| [get_Matrix02](./get_matrix02/)() const | Retourneert een waarde in de 0e rij en 2e kolom. |
| [get_Matrix03](./get_matrix03/)() const | Retourneert een waarde in de 0e rij en 3e kolom. |
| [get_Matrix04](./get_matrix04/)() const | Retourneert een waarde in 0e rij en 4e kolom. |
| [get_Matrix10](./get_matrix10/)() const | Retourneert een waarde in 1e rij en 0e kolom. |
| [get_Matrix11](./get_matrix11/)() const | Retourneert een waarde in 1e rij en 1e kolom. |
| [get_Matrix12](./get_matrix12/)() const | Retourneert een waarde in 1e rij en 2e kolom. |
| [get_Matrix13](./get_matrix13/)() const | Retourneert een waarde in 1e rij en 3e kolom. |
| [get_Matrix14](./get_matrix14/)() const | Retourneert een waarde in 1e rij en 4e kolom. |
| [get_Matrix20](./get_matrix20/)() const | Retourneert een waarde in 2e rij en 0e kolom. |
| [get_Matrix21](./get_matrix21/)() const | Retourneert een waarde in 2e rij en 1e kolom. |
| [get_Matrix22](./get_matrix22/)() const | Retourneert een waarde in 2e rij en 2e kolom. |
| [get_Matrix23](./get_matrix23/)() const | Retourneert een waarde in 2e rij en 3e kolom. |
| [get_Matrix24](./get_matrix24/)() const | Retourneert een waarde in 2e rij en 4e kolom. |
| [get_Matrix30](./get_matrix30/)() const | Retourneert een waarde in 3e rij en 0e kolom. |
| [get_Matrix31](./get_matrix31/)() const | Retourneert een waarde in 3e rij en 1e kolom. |
| [get_Matrix32](./get_matrix32/)() const | Retourneert een waarde in 3e rij en 2e kolom. |
| [get_Matrix33](./get_matrix33/)() const | Retourneert een waarde in 3e rij en 3e kolom. |
| [get_Matrix34](./get_matrix34/)() const | Retourneert een waarde in 3e rij en 4e kolom. |
| [get_Matrix40](./get_matrix40/)() const | Retourneert een waarde in 4e rij en 0e kolom. |
| [get_Matrix41](./get_matrix41/)() const | Retourneert een waarde in 4e rij en 1e kolom. |
| [get_Matrix42](./get_matrix42/)() const | Retourneert een waarde in 4e rij en 2e kolom. |
| [get_Matrix43](./get_matrix43/)() const | Retourneert een waarde in 4e rij en 3e kolom. |
| [get_Matrix44](./get_matrix44/)() const | Retourneert een waarde in 4e rij en 4e kolom. |
| [idx_get](./idx_get/)(int, int) | Retourneert een waarde op de opgegeven rij en kolom. |
| [idx_set](./idx_set/)(int, int, float) | Stelt de opgegeven waarde in op de opgegeven locatie in de matrix. |
| [set_Matrix00](./set_matrix00/)(float) | Stelt een waarde in in de 0e rij en 0e kolom. |
| [set_Matrix01](./set_matrix01/)(float) | Stelt een waarde in in de 0e rij en 1e kolom. |
| [set_Matrix02](./set_matrix02/)(float) | Stelt een waarde in op rij 0 en kolom 2. |
| [set_Matrix03](./set_matrix03/)(float) | Stelt een waarde in op rij 0 en kolom 3. |
| [set_Matrix04](./set_matrix04/)(float) | Stelt een waarde in op rij 0 en kolom 4. |
| [set_Matrix10](./set_matrix10/)(float) | Stelt een waarde in op rij 1 en kolom 0. |
| [set_Matrix11](./set_matrix11/)(float) | Stelt een waarde in op rij 1 en kolom 1. |
| [set_Matrix12](./set_matrix12/)(float) | Stelt een waarde in op rij 1 en kolom 2. |
| [set_Matrix13](./set_matrix13/)(float) | Stelt een waarde in op rij 1 en kolom 3. |
| [set_Matrix14](./set_matrix14/)(float) | Stelt een waarde in op rij 1 en kolom 4. |
| [set_Matrix20](./set_matrix20/)(float) | Stelt een waarde in op rij 2 en kolom 0. |
| [set_Matrix21](./set_matrix21/)(float) | Stelt een waarde in op rij 2 en kolom 1. |
| [set_Matrix22](./set_matrix22/)(float) | Stelt een waarde in op rij 2 en kolom 2. |
| [set_Matrix23](./set_matrix23/)(float) | Stelt een waarde in op rij 2 en kolom 3. |
| [set_Matrix24](./set_matrix24/)(float) | Stelt een waarde in op rij 2 en kolom 4. |
| [set_Matrix30](./set_matrix30/)(float) | Stelt een waarde in op rij 3 en kolom 0. |
| [set_Matrix31](./set_matrix31/)(float) | Stelt een waarde in op rij 3 en kolom 1. |
| [set_Matrix32](./set_matrix32/)(float) | Stelt een waarde in op rij 3 en kolom 2. |
| [set_Matrix33](./set_matrix33/)(float) | Stelt een waarde in op rij 3 en kolom 3. |
| [set_Matrix34](./set_matrix34/)(float) | Stelt een waarde in op rij 3 en kolom 4. |
| [set_Matrix40](./set_matrix40/)(float) | Stelt een waarde in op rij 4 en kolom 0. |
| [set_Matrix41](./set_matrix41/)(float) | Stelt een waarde in op rij 4 en kolom 1. |
| [set_Matrix42](./set_matrix42/)(float) | Stelt een waarde in op rij 4 en kolom 2. |
| [set_Matrix43](./set_matrix43/)(float) | Stelt een waarde in op rij 4 en kolom 3. |
| [set_Matrix44](./set_matrix44/)(float) | Stelt een waarde in op rij 4 en kolom 4. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
