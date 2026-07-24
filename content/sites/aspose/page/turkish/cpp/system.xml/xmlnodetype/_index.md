---
title: "System::Xml::XmlNodeType enum"
linktitle: "XmlNodeType"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNodeType enum. C++'ta düğüm tipini belirtir."
type: docs
weight: 6200
url: /tr/cpp/system.xml/xmlnodetype/
---
## XmlNodeType enum


Düğüm türünü belirtir.

```cpp
enum class XmlNodeType
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| None | 0 | Bu, **Read** yöntemi çağrılmamışsa [XmlReader](../xmlreader/) tarafından döndürülür. |
| Element | 1 | Bir öğe (örneğin, **<item>**). |
| Attribute | 2 | Bir öznitelik (örneğin, **id='123'**). |
| Text | 3 | Bir düğümün metin içeriği. Bir [XmlNodeType::Text](./) düğümünün alt düğümleri olamaz. [XmlNodeType::Attribute](./), [XmlNodeType::DocumentFragment](./), [XmlNodeType::Element](./) ve [XmlNodeType::EntityReference](./) düğümlerinin alt düğümü olarak görünebilir. |
| CDATA | 4 | Bir CDATA bölümü (örneğin, **my escaped text**). |
| EntityReference | 5 | Bir varlığa referans (örneğin, **&num;**). |
| Entity | 6 | Bir varlık bildirimi (örneğin, **<!ENTITY...>**). |
| ProcessingInstruction | 7 | Bir işleme talimatı (örneğin, **<?pi test?>**). |
| Comment | 8 | Bir yorum (örneğin, ****). |
| Document | 9 | Belge ağacının kökü olarak, tüm XML belgesine erişim sağlayan bir belge nesnesi. |
| DocumentType | 10 | Belge türü bildirimi, aşağıdaki etiketle gösterilir (örneğin, **<!DOCTYPE...>**). |
| DocumentFragment | 11 | Bir belge parçacığı. |
| Notasyon | 12 | Belge türü bildirimindeki bir notasyon (örneğin, **<!NOTATION...>**). |
| Boşluk | 13 | İşaretleme arasındaki boşluk. |
| SignificantWhitespace | 14 | Karışık içerik modelinde işaretleme arasındaki boşluk veya **xml:space=\"preserve\"** kapsamı içindeki boşluk. |
| EndElement | 15 | Bir son öğe etiketi (örneğin, ****). |
| EndEntity | 16 | [XmlReader](../xmlreader/) bir varlık değiştirme işleminin sonuna ulaştığında ve [XmlReader::ResolveEntity](../xmlreader/resolveentity/) çağrısının bir sonucu olarak döndürülür. |
| XmlDeclaration | 17 | XML bildirimi (örneğin, **<?xml version='1.0'?>**). [XmlNodeType::XmlDeclaration](./) düğümü belgenin ilk düğümü olmalıdır. Çocukları olamaz. [XmlNodeType::Document](./) düğümünün bir çocuğudur. Sürüm ve kodlama bilgisi sağlayan özniteliklere sahip olabilir. |

## Ayrıca Bakınız

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
