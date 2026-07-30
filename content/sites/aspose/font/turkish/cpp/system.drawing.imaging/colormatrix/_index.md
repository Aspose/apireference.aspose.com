---
title: "System::Drawing::Imaging::ColorMatrix sınıfı"
linktitle: "ColorMatrix"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Imaging::ColorMatrix sınıfı. RGBAW renk uzayı için koordinatları içeren 5x5 bir matris temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 300
url: /tr/cpp/system.drawing.imaging/colormatrix/
---
## ColorMatrix class


RGBAW renk uzayı için koordinatları içeren 5x5 bir matris temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class ColorMatrix : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ColorMatrix](./colormatrix/)() | Yeni bir [ColorMatrix](./) sınıf örneği oluşturur ve onu birim matrisin değerleriyle başlatır. |
| [ColorMatrix](./colormatrix/)(const System::ArrayPtr\<System::ArrayPtr\<float\>\>\&) | Yeni bir [ColorMatrix](./) sınıf örneği oluşturur ve belirtilen değerlerle başlatır. |
| [get_Matrix00](./get_matrix00/)() const | 0. satır ve 0. sütundaki değeri döndürür. |
| [get_Matrix01](./get_matrix01/)() const | 0. satır ve 1. sütundaki değeri döndürür. |
| [get_Matrix02](./get_matrix02/)() const | 0. satır ve 2. sütundaki değeri döndürür. |
| [get_Matrix03](./get_matrix03/)() const | 0. satır ve 3. sütundaki değeri döndürür. |
| [get_Matrix04](./get_matrix04/)() const | 0. satır ve 4. sütundaki değeri döndürür. |
| [get_Matrix10](./get_matrix10/)() const | 1. satır ve 0. sütundaki değeri döndürür. |
| [get_Matrix11](./get_matrix11/)() const | 1. satır ve 1. sütundaki değeri döndürür. |
| [get_Matrix12](./get_matrix12/)() const | 1. satır ve 2. sütunda bir değer döndürür. |
| [get_Matrix13](./get_matrix13/)() const | 1. satır ve 3. sütunda bir değer döndürür. |
| [get_Matrix14](./get_matrix14/)() const | 1. satır ve 4. sütunda bir değer döndürür. |
| [get_Matrix20](./get_matrix20/)() const | 2. satır ve 0. sütunda bir değer döndürür. |
| [get_Matrix21](./get_matrix21/)() const | 2. satır ve 1. sütunda bir değer döndürür. |
| [get_Matrix22](./get_matrix22/)() const | 2. satır ve 2. sütunda bir değer döndürür. |
| [get_Matrix23](./get_matrix23/)() const | 2. satır ve 3. sütunda bir değer döndürür. |
| [get_Matrix24](./get_matrix24/)() const | 2. satır ve 4. sütunda bir değer döndürür. |
| [get_Matrix30](./get_matrix30/)() const | 3. satır ve 0. sütunda bir değer döndürür. |
| [get_Matrix31](./get_matrix31/)() const | 3. satır ve 1. sütunda bir değer döndürür. |
| [get_Matrix32](./get_matrix32/)() const | 3. satır ve 2. sütunda bir değer döndürür. |
| [get_Matrix33](./get_matrix33/)() const | 3. satır ve 3. sütunda bir değer döndürür. |
| [get_Matrix34](./get_matrix34/)() const | 3. satır ve 4. sütunda bir değer döndürür. |
| [get_Matrix40](./get_matrix40/)() const | 4. satır ve 0. sütunda bir değer döndürür. |
| [get_Matrix41](./get_matrix41/)() const | 4. satır ve 1. sütunda bir değer döndürür. |
| [get_Matrix42](./get_matrix42/)() const | 4. satır ve 2. sütunda bir değer döndürür. |
| [get_Matrix43](./get_matrix43/)() const | 4. satır ve 3. sütunda bir değer döndürür. |
| [get_Matrix44](./get_matrix44/)() const | 4. satır ve 4. sütunda bir değer döndürür. |
| [idx_get](./idx_get/)(int, int) | Belirtilen satır ve sütunda bir değer döndürür. |
| [idx_set](./idx_set/)(int, int, float) | Matrisin belirtilen konumunda belirtilen değeri ayarlar. |
| [set_Matrix00](./set_matrix00/)(float) | 0. satır ve 0. sütunda bir değer ayarlar. |
| [set_Matrix01](./set_matrix01/)(float) | 0. satır ve 1. sütunda bir değer ayarlar. |
| [set_Matrix02](./set_matrix02/)(float) | 0. satır ve 2. sütunda bir değer ayarlar. |
| [set_Matrix03](./set_matrix03/)(float) | 0. satır ve 3. sütunda bir değer ayarlar. |
| [set_Matrix04](./set_matrix04/)(float) | 0. satır ve 4. sütunda bir değer ayarlar. |
| [set_Matrix10](./set_matrix10/)(float) | 1. satırın 0. sütununa bir değer ayarlar. |
| [set_Matrix11](./set_matrix11/)(float) | 1. satırın 1. sütununa bir değer ayarlar. |
| [set_Matrix12](./set_matrix12/)(float) | 1. satırın 2. sütununa bir değer ayarlar. |
| [set_Matrix13](./set_matrix13/)(float) | 1. satırın 3. sütununa bir değer ayarlar. |
| [set_Matrix14](./set_matrix14/)(float) | 1. satırın 4. sütununa bir değer ayarlar. |
| [set_Matrix20](./set_matrix20/)(float) | 2. satırın 0. sütununa bir değer ayarlar. |
| [set_Matrix21](./set_matrix21/)(float) | 2. satırın 1. sütununa bir değer ayarlar. |
| [set_Matrix22](./set_matrix22/)(float) | 2. satırın 2. sütununa bir değer ayarlar. |
| [set_Matrix23](./set_matrix23/)(float) | 2. satırın 3. sütununa bir değer ayarlar. |
| [set_Matrix24](./set_matrix24/)(float) | 2. satırın 4. sütununa bir değer ayarlar. |
| [set_Matrix30](./set_matrix30/)(float) | 3. satırın 0. sütununa bir değer ayarlar. |
| [set_Matrix31](./set_matrix31/)(float) | 3. satırın 1. sütununa bir değer ayarlar. |
| [set_Matrix32](./set_matrix32/)(float) | 3. satırın 2. sütununa bir değer ayarlar. |
| [set_Matrix33](./set_matrix33/)(float) | 3. satırın 3. sütununa bir değer ayarlar. |
| [set_Matrix34](./set_matrix34/)(float) | 3. satırın 4. sütununa bir değer ayarlar. |
| [set_Matrix40](./set_matrix40/)(float) | 4. satırın 0. sütununa bir değer ayarlar. |
| [set_Matrix41](./set_matrix41/)(float) | 4. satırın 1. sütununa bir değer ayarlar. |
| [set_Matrix42](./set_matrix42/)(float) | 4. satırın 2. sütununa bir değer ayarlar. |
| [set_Matrix43](./set_matrix43/)(float) | 4. satırın 3. sütununa bir değer ayarlar. |
| [set_Matrix44](./set_matrix44/)(float) | 4. satırın 4. sütununa bir değer ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
