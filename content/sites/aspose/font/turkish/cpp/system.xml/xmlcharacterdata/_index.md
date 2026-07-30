---
title: "System::Xml::XmlCharacterData sınıfı"
linktitle: "XmlCharacterData"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlCharacterData sınıfı. C++'ta birkaç sınıf tarafından kullanılan metin işleme yöntemleri sağlar."
type: docs
weight: 900
url: /tr/cpp/system.xml/xmlcharacterdata/
---
## XmlCharacterData class


Birçok sınıf tarafından kullanılan metin işleme yöntemlerini sağlar.

```cpp
class XmlCharacterData : public System::Xml::XmlLinkedNode
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [AppendData](./appenddata/)(String) | Belirtilen dizeyi düğümün karakter verisinin sonuna ekler. |
| virtual [DeleteData](./deletedata/)(int32_t, int32_t) | Düğümden bir dizi karakteri kaldırır. |
| virtual [get_Data](./get_data/)() | Düğümün verisini döndürür. |
| [get_InnerText](./get_innertext/)() override | Düğümün ve tüm alt düğümlerin birleştirilmiş değerlerini döndürür. |
| virtual [get_Length](./get_length/)() | Verinin uzunluğunu, karakter cinsinden döndürür. |
| [get_Value](./get_value/)() override | Düğümün değerini döndürür. |
| virtual [InsertData](./insertdata/)(int32_t, String) | Belirtilen dizeyi belirtilen karakter konumunda ekler. |
| virtual [ReplaceData](./replacedata/)(int32_t, int32_t, String) | Belirtilen konumdan başlayan belirtilen sayıda karakteri belirtilen dizeyle değiştirir. |
| virtual [set_Data](./set_data/)(String) | Düğümün verisini ayarlar. |
| [set_InnerText](./set_innertext/)(String) override | Düğümün ve tüm alt düğümlerin birleştirilmiş değerlerini ayarlar. |
| [set_Value](./set_value/)(String) override | Düğümün değerini ayarlar. |
| virtual [Substring](./substring/)(int32_t, int32_t) | Belirtilen aralıktaki tam dizeden bir alt dize alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Ayrıca Bakınız

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
