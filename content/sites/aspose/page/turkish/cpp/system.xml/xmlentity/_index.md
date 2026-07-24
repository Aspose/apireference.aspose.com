---
title: "System::Xml::XmlEntity class"
linktitle: "XmlEntity"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlEntity sınıfı. C++'da <!ENTITY... > gibi bir varlık bildirimini temsil eder."
type: docs
weight: 1800
url: /tr/cpp/system.xml/xmlentity/
---
## XmlEntity class


Bir varlık bildirimini temsil eder, örneğin **<!ENTITY... >**.

```cpp
class XmlEntity : public System::Xml::XmlNode
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Bu düğümün bir kopyasını oluşturur. Varlık düğümleri kopyalanamaz. Bu yöntemi bir [XmlEntity](./) nesnesi üzerinde çağırmak bir istisna fırlatır. |
| [get_BaseURI](./get_baseuri/)() override | Geçerli düğümün temel Evrensel Kaynak Tanımlayıcısını (URI) döndürür. |
| [get_InnerText](./get_innertext/)() override | Varlık düğümünün ve tüm alt düğümlerinin birleştirilmiş değerlerini döndürür. |
| [get_InnerXml](./get_innerxml/)() override | Bu düğümün çocuklarını temsil eden işaretlemeyi döndürür. |
| [get_IsReadOnly](./get_isreadonly/)() override | Düğümün yalnızca okunur olup olmadığını gösteren bir değer döndürür. |
| [get_LocalName](./get_localname/)() override | Ad alanı öneki olmadan düğümün adını döndürür. |
| [get_Name](./get_name/)() override | Düğümün adını döndürür. |
| [get_NodeType](./get_nodetype/)() override | Düğümün tipini döndürür. |
| [get_NotationName](./get_notationname/)() | Varlık bildirimindeki isteğe bağlı NDATA özniteliğinin adını döndürür. |
| [get_OuterXml](./get_outerxml/)() override | Bu düğümü ve tüm alt düğümlerini temsil eden işaretlemeyi döndürür. |
| [get_PublicId](./get_publicid/)() | Varlık bildirimindeki genel tanımlayıcının değerini döndürür. |
| [get_SystemId](./get_systemid/)() | Varlık bildirimindeki sistem tanımlayıcının değerini döndürür. |
| [set_InnerText](./set_innertext/)(String) override | Varlık düğümünün ve tüm alt düğümlerinin birleştirilmiş değerlerini ayarlar. |
| [set_InnerXml](./set_innerxml/)(String) override | Bu düğümün alt düğümlerini temsil eden işaretlemeyi ayarlar. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümün tüm alt düğümlerini belirtilen [XmlWriter](../xmlwriter/) öğesine kaydeder. [XmlEntity](./) düğümleri için bu yöntem hiçbir etki yapmaz. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümü belirtilen [XmlWriter](../xmlwriter/) öğesine kaydeder. [XmlEntity](./) düğümleri için bu yöntem hiçbir etki yapmaz. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
