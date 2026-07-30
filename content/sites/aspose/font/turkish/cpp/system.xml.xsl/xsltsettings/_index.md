---
title: "System::Xml::Xsl::XsltSettings class"
linktitle: "XsltSettings"
second_title: "Aspose.Font için C++"
description: "System::Xml::Xsl::XsltSettings sınıfı. C++'ta XSLT stil sayfasının yürütülmesi sırasında desteklenecek XSLT özelliklerini belirtir."
type: docs
weight: 800
url: /tr/cpp/system.xml.xsl/xsltsettings/
---
## XsltSettings class


XSLT stil sayfasının yürütülmesi sırasında desteklenecek XSLT özelliklerini belirtir.

```cpp
class XsltSettings : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [get_Default](./get_default/)() | Varsayılan ayarlarla bir [XsltSettings](./) nesnesi döndürür. XSLT **document()** işlevi ve gömülü betik blokları desteği devre dışı bırakılmıştır. |
| [get_EnableDocumentFunction](./get_enabledocumentfunction/)() | XSLT **document()** işlevi desteğini etkinleştirip etkinleştirmeyeceğini gösteren bir değer döndürür. |
| [get_EnableScript](./get_enablescript/)() | Gömülü betik blokları desteğini etkinleştirip etkinleştirmeyeceğini gösteren bir değer döndürür. |
| static [get_TrustedXslt](./get_trustedxslt/)() | XSLT **document()** işlevi ve gömülü betik blokları desteğini etkinleştiren bir [XsltSettings](./) nesnesi döndürür. |
| [set_EnableDocumentFunction](./set_enabledocumentfunction/)(bool) | XSLT **document()** işlevi desteğini etkinleştirip etkinleştirmeyeceğini belirten bir değeri ayarlar. |
| [set_EnableScript](./set_enablescript/)(bool) | Gömülü betik blokları desteğini etkinleştirip etkinleştirmeyeceğini belirten bir değeri ayarlar. |
| [XsltSettings](./xsltsettings/)() | [XsltSettings](./) sınıfının yeni bir örneğini varsayılan ayarlarla başlatır. |
| [XsltSettings](./xsltsettings/)(bool, bool) | [XsltSettings](./) sınıfının yeni bir örneğini belirtilen ayarlarla başlatır. |
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
