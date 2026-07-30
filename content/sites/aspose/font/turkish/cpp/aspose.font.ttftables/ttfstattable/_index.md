---
title: "Aspose::Font::TtfTables::TtfStatTable sınıfı"
linktitle: "TtfStatTable"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TtfTables::TtfStatTable sınıfı. C++'ta OpenType fontunun Style Attributes Table (STAT) tablosunu temsil eder."
type: docs
weight: 1700
url: /tr/cpp/aspose.font.ttftables/ttfstattable/
---
## TtfStatTable class


OpenType fontunun Style Attributes Table(STAT) tablosunu temsil eder.

```cpp
class TtfStatTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [AxisRecord](./axisrecord/)
* Class [AxisValue](./axisvalue/)
* Class [AxisValueTableBase](./axisvaluetablebase/)
* Class [AxisValueTableFormat1](./axisvaluetableformat1/)
* Class [AxisValueTableFormat2](./axisvaluetableformat2/)
* Class [AxisValueTableFormat3](./axisvaluetableformat3/)
* Class [AxisValueTableFormat4](./axisvaluetableformat4/)
## Enums

| Enum | Açıklama |
| --- | --- |
| [AxisValueTableFlags](./axisvaluetableflags/) | Eksen değer tablosu bayraklarını belirtir. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddAxisRecord](./addaxisrecord/)(System::SharedPtr\<TtfStatTable::AxisRecord\>) | Tabloya bir Axis Record yapısı ekler. |
| [AddAxisValueTable](./addaxisvaluetable/)(System::SharedPtr\<TtfStatTable::AxisValueTableBase\>) | Tabloya bir Axis Value Table yapısı ekler. |
| [ClearAxisRecords](./clearaxisrecords/)() | Tablodan tüm eksen kayıtlarını kaldırır. |
| [ClearAxisValueTables](./clearaxisvaluetables/)() | Tablodan tüm eksen değer tablolarını kaldırır. |
| [get_AxisRecords](./get_axisrecords/)() | Tasarım eksenleri dizisini döndürür. Eksenler dizisi, Axis Record tipindeki yapıların bir dizisidir. Spec: eksen kaydı, tek bir tasarım ekseni hakkında bilgi sağlar. |
| [get_AxisValueCount](./get_axisvaluecount/)() | Eksen değer tablolarının sayısını döndürür. |
| [get_AxisValueTables](./get_axisvaluetables/)() | Axis Value Tables dizisini döndürür. Spec: Axis Value Tables, belirli bir tasarım varyasyonu eksenindeki belirli bir stil-öznitelik değerine veya tasarım-varyasyon eksen değerlerinin bir kombinasyonuna ilişkin ayrıntıları ve bu değerlerin alt aile adlarındaki öğe olarak kullanılan etiketlerle ilişkisini sağlar. |
| [get_DesignAxisCount](./get_designaxiscount/)() | Eksen kayıtlarının sayısını döndürür. Spec: 'fvar' tablosu olan bir fontta, bu değer 'fvar' tablosundaki axisCount değerine eşit ya da daha büyük olmalıdır. Tüm fontlarda, axisValueCount sıfırdan büyükse bu değer sıfırdan büyük olmalıdır. |
| [get_ElidedFallbackName](./get_elidedfallbackname/)() | Spec: Belirli bir font modeline isimlerin projeksiyonu yalnızca elidable öğeler içeren bir alt aile adı ürettiğinde kullanılan yedek isim. |
| [get_ElidedFallbackNameId](./get_elidedfallbacknameid/)() | Spec: Belirli bir font modeline isimlerin projeksiyonu yalnızca elidable öğeler içeren bir alt aile adı ürettiğinde kullanılan yedek İsim Kimliği. |
| static [get_Tag](./get_tag/)() | Tablo etiketini alır. |
## Ayrıca Bakınız

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
