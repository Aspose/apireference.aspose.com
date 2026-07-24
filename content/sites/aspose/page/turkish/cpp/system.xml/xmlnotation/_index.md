---
title: "System::Xml::XmlNotation sınıfı"
linktitle: "XmlNotation"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNotation sınıfı. C++'da <!NOTATION... > gibi bir notasyon bildirimi temsil eder."
type: docs
weight: 2900
url: /tr/cpp/system.xml/xmlnotation/
---
## XmlNotation class


**<!NOTATION... >** gibi bir gösterim bildirimini temsil eder.

```cpp
class XmlNotation : public System::Xml::XmlNode
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Bu düğümün bir kopyasını oluşturur. Notasyon düğümleri kopyalanamaz. Bu yöntemi bir [XmlNotation](./) nesnesi üzerinde çağırmak bir istisna fırlatır. |
| [get_InnerXml](./get_innerxml/)() override | Bu düğümün çocuklarını temsil eden işaretlemeyi döndürür. |
| [get_IsReadOnly](./get_isreadonly/)() override | Düğümün yalnızca okunur olup olmadığını gösteren bir değer döndürür. |
| [get_LocalName](./get_localname/)() override | Geçerli düğümün adını, ad alanı öneki olmadan döndürür. |
| [get_Name](./get_name/)() override | Geçerli düğümün adını döndürür. |
| [get_NodeType](./get_nodetype/)() override | Geçerli düğümün tipini döndürür. |
| [get_OuterXml](./get_outerxml/)() override | Bu düğümü ve tüm alt düğümlerini temsil eden işaretlemeyi döndürür. |
| [get_PublicId](./get_publicid/)() | Notasyon bildirimindeki genel tanımlayıcının değerini döndürür. |
| [get_SystemId](./get_systemid/)() | Notasyon bildirimindeki sistem tanımlayıcının değerini döndürür. |
| [set_InnerXml](./set_innerxml/)(String) override | Bu düğümün alt düğümlerini temsil eden işaretlemeyi ayarlar. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümün alt düğümlerini belirtilen [XmlWriter](../xmlwriter/) ile kaydeder. Bu yöntem, [XmlNotation](./) düğümlerini etkilemez. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümü belirtilen [XmlWriter](../xmlwriter/) ile kaydeder. Bu yöntem, [XmlNotation](./) düğümlerini etkilemez. |
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
