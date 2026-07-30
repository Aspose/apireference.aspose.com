---
title: "System::Xml::XmlValidatingReader::XmlValidatingReader yapıcı"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlValidatingReader::XmlValidatingReader yapıcı. C++'ta belirtilen değerlerle XmlValidatingReader sınıfının yeni bir örneğini başlatır."
type: docs
weight: 100
url: /tr/cpp/system.xml/xmlvalidatingreader/xmlvalidatingreader/
---
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Belirtilen değerlerle [XmlValidatingReader](../) sınıfının yeni bir örneğini başlatır.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | Ayrıştırılacak XML parçacığını içeren akış. |
| fragType | XmlNodeType | XML parçacığının [XmlNodeType](../../xmlnodetype/) değeri. Bu, parçacığın ne içerebileceğini belirler (aşağıdaki tabloya bakınız). |
| context | const SharedPtr\<XmlParserContext\>\& | [XmlParserContext](../../xmlparsercontext/) içinde XML parçacığının ayrıştırılacağı ortam. Bu, kullanılacak [XmlNameTable](../../xmlnametable/), kodlama, ad alanı kapsamı, geçerli **xml:lang** ve **xml:space** kapsamını içerir. |
## Açıklamalar



Aşağıdaki tablo, **fragType** için geçerli değerleri ve okuyucunun farklı düğüm türlerini nasıl ayrıştırdığını listeler. |||
|-|-|
| XmlNodeType | Parçacık Şunları İçerebilir |
| Element | Geçerli herhangi bir öğe içeriği (örneğin, öğeler, yorumlar, işleme talimatları, cdata, metin ve varlık referanslarının herhangi bir kombinasyonu). |
| Attribute | Bir niteliğin değeri (tırnak işaretleri içindeki kısım). |
| Belge | Tam bir XML belgesinin içeriği; bu, belge düzeyindeki kuralları zorlar. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<XmlReader\>\&) constructor


Verilen [XmlReader](../../xmlreader/) tarafından döndürülen içeriği doğrulayan yeni bir [XmlValidatingReader](../) sınıfı örneği başlatır.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<XmlReader> &reader)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| reader | const SharedPtr\<XmlReader\>\& | Doğrulama sırasında okunacak [XmlReader](../../xmlreader/). Mevcut uygulama yalnızca [XmlTextReader](../../xmltextreader/) destekler. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Belirtilen değerlerle [XmlValidatingReader](../) sınıfının yeni bir örneğini başlatır.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xmlFragment | const String\& | Ayrıştırılacak XML parçacığını içeren string. |
| fragType | XmlNodeType | XML parçacığının [XmlNodeType](../../xmlnodetype/) türü. Bu ayrıca parçacık dizesinin ne içerebileceğini belirler (aşağıdaki tabloya bakın). |
| context | const SharedPtr\<XmlParserContext\>\& | XML parçacığının ayrıştırılacağı [XmlParserContext](../../xmlparsercontext/). Bu, kullanılacak [NameTable](../../nametable/), kodlama, ad alanı kapsamı, geçerli **xml:lang** ve **xml:space** kapsamını içerir. |
## Açıklamalar



Aşağıdaki tablo, **fragType** için geçerli değerleri ve okuyucunun farklı düğüm türlerini nasıl ayrıştırdığını listeler. |||
|-|-|
| XmlNodeType | Parçacık Şunları İçerebilir |
| Element | Geçerli herhangi bir öğe içeriği (örneğin, öğeler, yorumlar, işleme talimatları, cdata, metin ve varlık referanslarının herhangi bir kombinasyonu). |
| Attribute | Bir niteliğin değeri (tırnak işaretleri içindeki kısım). |
| Belge | Tam bir XML belgesinin içeriği; bu, belge düzeyindeki kuralları zorlar. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
