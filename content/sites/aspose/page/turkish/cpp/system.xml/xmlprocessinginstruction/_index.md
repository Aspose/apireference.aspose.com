---
title: "System::Xml::XmlProcessingInstruction sınıfı"
linktitle: "XmlProcessingInstruction"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlProcessingInstruction sınıfı. C++'ta XML'in belge metninde işlemciye özgü bilgileri tutmak için tanımladığı işleme talimatını temsil eder."
type: docs
weight: 3100
url: /tr/cpp/system.xml/xmlprocessinginstruction/
---
## XmlProcessingInstruction class


XML'in belge metninde işlemciye özgü bilgileri tutmak için tanımladığı bir işleme talimatını temsil eder.

```cpp
class XmlProcessingInstruction : public System::Xml::XmlLinkedNode
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Bu düğümün bir kopyasını oluşturur. |
| [get_Data](./get_data/)() | İşleme talimatının içeriğini, hedefi hariç tutarak döndürür. |
| [get_InnerText](./get_innertext/)() override | Düğümün ve tüm çocuklarının birleştirilmiş değerlerini döndürür. |
| [get_LocalName](./get_localname/)() override | Düğümün yerel adını döndürür. |
| [get_Name](./get_name/)() override | Düğümün nitelikli adını döndürür. |
| [get_NodeType](./get_nodetype/)() override | Geçerli düğümün tipini döndürür. |
| [get_Target](./get_target/)() | İşleme talimatının hedefini döndürür. |
| [get_Value](./get_value/)() override | Düğümün değerini döndürür. |
| [set_Data](./set_data/)(const String\&) | Hedefi hariç tutarak işleme talimatının içeriğini ayarlar. |
| [set_InnerText](./set_innertext/)(String) override | Düğümün ve tüm alt öğelerinin birleştirilmiş değerlerini ayarlar. |
| [set_Value](./set_value/)(String) override | Düğümün değerini ayarlar. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Belirtilen [XmlWriter](../xmlwriter/) üzerine düğümün tüm alt öğelerini kaydeder. ProcessingInstruction düğümlerinin alt öğesi olmadığından, bu yöntemin hiçbir etkisi yoktur. |
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
