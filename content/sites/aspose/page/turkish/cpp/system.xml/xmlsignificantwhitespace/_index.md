---
title: "System::Xml::XmlSignificantWhitespace sınıfı"
linktitle: "XmlSignificantWhitespace"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlSignificantWhitespace sınıfı. Karışık içerikli bir düğümde işaretleme arasındaki boşluğu veya xml:space=''preserve'' kapsamı içindeki boşluğu temsil eder. Bu, C++'da aynı zamanda anlamlı boşluk olarak da adlandırılır."
type: docs
weight: 3700
url: /tr/cpp/system.xml/xmlsignificantwhitespace/
---
## XmlSignificantWhitespace class


Karışık içerik düğümündeki işaretleme arasındaki boşlukları veya **xml:space='preserve'** kapsamı içindeki boşlukları temsil eder. Bu aynı zamanda anlamlı boşluk olarak da adlandırılır.

```cpp
class XmlSignificantWhitespace : public System::Xml::XmlCharacterData
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Bu düğümün bir kopyasını oluşturur. |
| [get_LocalName](./get_localname/)() override | Düğümün yerel adını döndürür. |
| [get_Name](./get_name/)() override | Düğümün nitelikli adını döndürür. |
| [get_NodeType](./get_nodetype/)() override | Geçerli düğümün tipini döndürür. |
| [get_PreviousText](./get_previoustext/)() override | Bu düğümden hemen önce gelen metin düğümünü döndürür. |
| [get_Value](./get_value/)() override | Düğümün değerini döndürür. |
| [set_Value](./set_value/)(String) override | Düğümün değerini ayarlar. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümün tüm çocuklarını belirtilen [XmlWriter](../xmlwriter/) öğesine kaydeder. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümü belirtilen [XmlWriter](../xmlwriter/) öğesine kaydeder. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
