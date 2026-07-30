---
title: "System::Xml::Xsl::XsltArgumentList sınıfı"
linktitle: "XsltArgumentList"
second_title: "Aspose.Font için C++"
description: "System::Xml::Xsl::XsltArgumentList sınıfı. C++ içinde XSLT parametreleri veya uzantı nesneleri olabilen değişken sayıda argüman içerir."
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
| [AddExtensionObject](./addextensionobject/)(const String\&, const SharedPtr\<Object\>\&) | Yeni bir nesneyi [XsltArgumentList](./) içine ekler ve bunu ad alanı URI'siyle ilişkilendirir. |
| [AddParam](./addparam/)(const String\&, const String\&, const SharedPtr\<Object\>\&) | Bir parametreyi [XsltArgumentList](./) içine ekler ve bunu ad alanı nitelikli adıyla ilişkilendirir. |
| [Clear](./clear/)() | [XsltArgumentList](./) içindeki tüm parametreleri ve uzantı nesnelerini kaldırır. |
| [GetExtensionObject](./getextensionobject/)(const String\&) | Verilen ad alanıyla ilişkili nesneyi döndürür. |
| [GetParam](./getparam/)(const String\&, const String\&) | Ad alanı nitelikli adıyla ilişkili parametreyi döndürür. |
| [RemoveExtensionObject](./removeextensionobject/)(const String\&) | Ad alanı URI'sine sahip nesneyi [XsltArgumentList](./) içinden kaldırır. |
| [RemoveParam](./removeparam/)(const String\&, const String\&) | Parametreyi [XsltArgumentList](./) içinden kaldırır. |
| [XsltArgumentList](./xsltargumentlist/)() | Yeni bir [XsltArgumentList](./) örneği oluşturur. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
