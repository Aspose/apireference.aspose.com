---
title: "System::Xml::XmlText class"
linktitle: "XmlText"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlText class. C++'de bir öğenin veya özniteliğin metin içeriğini temsil eder."
type: docs
weight: 3800
url: /tr/cpp/system.xml/xmltext/
---
## XmlText class


Bir öğenin veya özniteliğin metin içeriğini temsil eder.

```cpp
class XmlText : public System::Xml::XmlCharacterData
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
| virtual [SplitText](./splittext/)(int32_t) | Belirtilen konumda düğümü iki düğüme ayırır ve ikisini de ağaçta kardeş olarak tutar. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümün tüm çocuklarını belirtilen [XmlWriter](../xmlwriter/) öğesine kaydeder. [XmlText](./) düğümlerinin çocuğu yoktur, bu yüzden bu yöntem hiçbir etki yapmaz. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümü belirtilen [XmlWriter](../xmlwriter/) öğesine kaydeder. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
