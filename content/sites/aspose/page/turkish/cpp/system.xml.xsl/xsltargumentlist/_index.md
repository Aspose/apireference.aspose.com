---
title: "System::Xml::Xsl::XsltArgumentList sınıfı"
linktitle: "XsltArgumentList"
second_title: "Aspose.Page için C++"
description: "System::Xml::Xsl::XsltArgumentList sınıfı. C++'ta XSLT parametreleri veya uzantı nesneleri olabilen değişken sayıda argüman içerir."
type: docs
weight: 400
url: /tr/cpp/system.xml.xsl/xsltargumentlist/
---
## XsltArgumentList class


XSLT parametreleri veya uzantı nesneleri olabilen değişken sayıda bağımsız değişken içerir.

```cpp
class XsltArgumentList : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddExtensionObject](./addextensionobject/)(const String\&, const SharedPtr\<Object\>\&) | Yeni bir nesneyi [XsltArgumentList](./) içine ekler ve onu namespace URI'siyle ilişkilendirir. |
| [AddParam](./addparam/)(const String\&, const String\&, const SharedPtr\<Object\>\&) | Bir parametreyi [XsltArgumentList](./) içine ekler ve onu namespace nitelikli adıyla ilişkilendirir. |
| [Clear](./clear/)() | [XsltArgumentList](./) içindeki tüm parametreleri ve uzantı nesnelerini kaldırır. |
| [GetExtensionObject](./getextensionobject/)(const String\&) | Verilen namespace ile ilişkilendirilmiş nesneyi döndürür. |
| [GetParam](./getparam/)(const String\&, const String\&) | Namespace nitelikli adıyla ilişkilendirilmiş parametreyi döndürür. |
| [RemoveExtensionObject](./removeextensionobject/)(const String\&) | Namespace URI'sine sahip nesneyi [XsltArgumentList](./) üzerinden kaldırır. |
| [RemoveParam](./removeparam/)(const String\&, const String\&) | Parametreyi [XsltArgumentList](./) üzerinden kaldırır. |
| [XsltArgumentList](./xsltargumentlist/)() | Yeni bir [XsltArgumentList](./) örneği oluşturur. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
