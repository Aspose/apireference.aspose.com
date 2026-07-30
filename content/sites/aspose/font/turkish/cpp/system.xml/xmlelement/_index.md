---
title: "System::Xml::XmlElement sınıf"
linktitle: "XmlElement"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlElement sınıf. C++'da bir öğeyi temsil eder."
type: docs
weight: 1700
url: /tr/cpp/system.xml/xmlelement/
---
## XmlElement class


Bir öğeyi temsil eder.

```cpp
class XmlElement : public System::Xml::XmlLinkedNode
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Bu düğümün bir kopyasını oluşturur. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Geçerli düğümün herhangi bir özniteliği olup olmadığını gösteren bir **bool** değer döndürür. |
| [get_InnerText](./get_innertext/)() override | Düğümün ve tüm alt öğelerinin birleştirilmiş değerlerini döndürür. |
| [get_InnerXml](./get_innerxml/)() override | Bu düğümün yalnızca alt öğelerini temsil eden işaretlemeyi döndürür. |
| [get_IsEmpty](./get_isempty/)() | Öğenin etiket biçimini döndürür. |
| [get_LocalName](./get_localname/)() override | Geçerli düğümün yerel adını döndürür. |
| [get_Name](./get_name/)() override | Düğümün nitelikli adını döndürür. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Bu düğümün ad alanı URI'sını döndürür. |
| [get_NodeType](./get_nodetype/)() override | Geçerli düğümün tipini döndürür. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Bu düğümün ait olduğu [XmlDocument](../xmldocument/) öğesini döndürür. |
| [get_Prefix](./get_prefix/)() override | Bu düğümün ad alanı önekini döndürür. |
| [get_SchemaInfo](./get_schemainfo/)() override | Şema doğrulaması sonucunda bu düğüme atanan post-şema doğrulama bilgi kümesini döndürür. |
| virtual [GetAttribute](./getattribute/)(String) | Belirtilen adla özelliğin değerini döndürür. |
| virtual [GetAttribute](./getattribute/)(String, String) | Belirtilen yerel ad ve ad alanı URI'sine sahip özelliğin değerini döndürür. |
| virtual [GetAttributeNode](./getattributenode/)(String) | Belirtilen adla [XmlAttribute](../xmlattribute/) öğesini döndürür. |
| virtual [GetAttributeNode](./getattributenode/)(String, String) | Belirtilen yerel ad ve ad alanı URI'sine sahip [XmlAttribute](../xmlattribute/) öğesini döndürür. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | Belirtilen [XmlElement::get_Name](./get_name/) ile eşleşen tüm alt öğeleri içeren bir [XmlNodeList](../xmlnodelist/) döndürür. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | Belirtilen [XmlElement::get_LocalName](./get_localname/) ve [XmlElement::get_NamespaceURI](./get_namespaceuri/) değerleriyle eşleşen tüm alt öğeleri içeren bir [XmlNodeList](../xmlnodelist/) döndürür. |
| virtual [HasAttribute](./hasattribute/)(String) | Geçerli düğümün belirtilen adla bir özelliği olup olmadığını belirler. |
| virtual [HasAttribute](./hasattribute/)(String, String) | Geçerli düğümün belirtilen yerel ad ve ad alanı URI'sine sahip bir özelliği olup olmadığını belirler. |
| [RemoveAll](./removeall/)() override | Geçerli düğümün belirtilen tüm özelliklerini ve alt öğelerini kaldırır. Varsayılan özellikler kaldırılmaz. |
| virtual [RemoveAllAttributes](./removeallattributes/)() | Elemandan belirtilen tüm özellikleri kaldırır. Varsayılan özellikler kaldırılmaz. |
| virtual [RemoveAttribute](./removeattribute/)(String) | Bir özelliği ada göre kaldırır. |
| virtual [RemoveAttribute](./removeattribute/)(String, String) | Belirtilen yerel ad ve ad alanı URI'sine sahip bir özelliği kaldırır. (Kaldırılan özelliğin varsayılan bir değeri varsa, hemen yerine konur). |
| virtual [RemoveAttributeAt](./removeattributeat/)(int32_t) | Elemandan belirtilen indeksdeki özellik düğümünü kaldırır. (Kaldırılan özelliğin varsayılan bir değeri varsa, hemen yerine konur). |
| virtual [RemoveAttributeNode](./removeattributenode/)(SharedPtr\<XmlAttribute\>) | Belirtilen [XmlAttribute](../xmlattribute/) öğesini kaldırır. |
| virtual [RemoveAttributeNode](./removeattributenode/)(String, String) | Yerel ad ve ad alanı URI'siyle belirtilen [XmlAttribute](../xmlattribute/) öğesini kaldırır. (Kaldırılan özelliğin varsayılan bir değeri varsa, hemen yerine konur). |
| [set_InnerText](./set_innertext/)(String) override | Düğümün ve tüm alt öğelerinin birleştirilmiş değerlerini ayarlar. |
| [set_InnerXml](./set_innerxml/)(String) override | Bu düğümün yalnızca alt öğelerini temsil eden işaretlemeyi ayarlar. |
| [set_IsEmpty](./set_isempty/)(bool) | Elemanın etiket biçimini ayarlar. |
| [set_Prefix](./set_prefix/)(String) override | Bu düğümün ad alanı önekini ayarlar. |
| virtual [SetAttribute](./setattribute/)(String, String) | Belirtilen adla özelliğin değerini ayarlar. |
| virtual [SetAttribute](./setattribute/)(String, String, String) | Belirtilen yerel ad ve ad alanı URI'sine sahip özelliğin değerini ayarlar. |
| virtual [SetAttributeNode](./setattributenode/)(SharedPtr\<XmlAttribute\>) | Belirtilen [XmlAttribute](../xmlattribute/) öğesini ekler. |
| virtual [SetAttributeNode](./setattributenode/)(String, String) | Belirtilen [XmlAttribute](../xmlattribute/) öğesini ekler. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümün tüm alt öğelerini belirtilen [XmlWriter](../xmlwriter/) öğesine kaydeder. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Geçerli düğümü belirtilen [XmlWriter](../xmlwriter/) öğesine kaydeder. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
