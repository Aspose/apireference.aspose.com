---
title: "System::Xml::XmlDeclaration sınıfı"
linktitle: "XmlDeclaration"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlDeclaration sınıfı. C++'da <?xml version=''1.0''...?> XML bildirim düğümünü temsil eder."
type: docs
weight: 1300
url: /tr/cpp/system.xml/xmldeclaration/
---
## XmlDeclaration class


XML deklarasyon düğümünü temsil eder **<?xml version='1.0'...?>**.

```cpp
class XmlDeclaration : public System::Xml::XmlLinkedNode
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Bu düğümün bir kopyasını oluşturur. |
| [get_Encoding](./get_encoding/)() | XML belgesinin kodlama seviyesini döndürür. |
| [get_InnerText](./get_innertext/)() override | [XmlDeclaration](./) öğesinin birleştirilmiş değerlerini döndürür. |
| [get_LocalName](./get_localname/)() override | Düğümün yerel adını döndürür. |
| [get_Name](./get_name/)() override | Düğümün nitelikli adını döndürür. |
| [get_NodeType](./get_nodetype/)() override | Geçerli düğümün tipini döndürür. |
| [get_Standalone](./get_standalone/)() | standalone özniteliğinin değerini döndürür. |
| [get_Value](./get_value/)() override | [XmlDeclaration](./) öğesinin değerini döndürür. |
| [get_Version](./get_version/)() | Belgenin XML sürümünü döndürür. |
| [set_Encoding](./set_encoding/)(const String\&) | XML belgesinin kodlama seviyesini ayarlar. |
| [set_InnerText](./set_innertext/)(String) override | [XmlDeclaration](./) öğesinin birleştirilmiş değerlerini ayarlar. |
| [set_Standalone](./set_standalone/)(const String\&) | standalone özniteliğinin değerini ayarlar. |
| [set_Value](./set_value/)(String) override | [XmlDeclaration](./) öğesinin değerini ayarlar. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümün alt öğelerini belirtilen [XmlWriter](../xmlwriter/) ile kaydeder. [XmlDeclaration](./) düğümlerinin alt öğesi olmadığından bu yöntem hiçbir etki yapmaz. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümü belirtilen [XmlWriter](../xmlwriter/) öğesine kaydeder. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
