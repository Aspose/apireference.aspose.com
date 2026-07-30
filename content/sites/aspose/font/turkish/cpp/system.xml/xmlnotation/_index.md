---
title: "System::Xml::XmlNotation sınıfı"
linktitle: "XmlNotation"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNotation sınıfı. C++'da <!NOTATION... > gibi bir notasyon bildirimini temsil eder."
type: docs
weight: 2900
url: /tr/cpp/system.xml/xmlnotation/
---
## XmlNotation class


Bir gösterim bildirimini temsil eder, örneğin **<!NOTATION... >**.

```cpp
class XmlNotation : public System::Xml::XmlNode
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Bu düğümün bir kopyasını oluşturur. Notasyon düğümleri kopyalanamaz. Bu yöntemi bir [XmlNotation](./) nesnesi üzerinde çağırmak bir istisna fırlatır. |
| [get_InnerXml](./get_innerxml/)() override | Bu düğümün çocuklarını temsil eden işaretlemeyi döndürür. |
| [get_IsReadOnly](./get_isreadonly/)() override | Düğümün yalnızca okunur olup olmadığını gösteren bir değer döndürür. |
| [get_LocalName](./get_localname/)() override | Geçerli düğümün adını, ad alanı ön eki olmadan döndürür. |
| [get_Name](./get_name/)() override | Geçerli düğümün adını döndürür. |
| [get_NodeType](./get_nodetype/)() override | Geçerli düğümün tipini döndürür. |
| [get_OuterXml](./get_outerxml/)() override | Bu düğümü ve tüm çocuklarını temsil eden işaretlemeyi döndürür. |
| [get_PublicId](./get_publicid/)() | Notasyon bildirimindeki genel tanımlayıcının değerini döndürür. |
| [get_SystemId](./get_systemid/)() | Notasyon bildirimindeki sistem tanımlayıcının değerini döndürür. |
| [set_InnerXml](./set_innerxml/)(String) override | Bu düğümün çocuklarını temsil eden işaretlemeyi ayarlar. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümün çocuklarını belirtilen [XmlWriter](../xmlwriter/) ile kaydeder. Bu yöntem [XmlNotation](./) düğümlerinde etkisizdir. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümü belirtilen [XmlWriter](../xmlwriter/) ile kaydeder. Bu yöntem [XmlNotation](./) düğümlerinde etkisizdir. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
