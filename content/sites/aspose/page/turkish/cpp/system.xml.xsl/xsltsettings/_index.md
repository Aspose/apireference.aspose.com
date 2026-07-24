---
title: "System::Xml::Xsl::XsltSettings class"
linktitle: "XsltSettings"
second_title: "Aspose.Page için C++"
description: "System::Xml::Xsl::XsltSettings sınıfı. C++'da XSLT stil sayfasının yürütülmesi sırasında desteklenecek XSLT özelliklerini belirtir."
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
| [get_EnableDocumentFunction](./get_enabledocumentfunction/)() | XSLT **document()** işlevi desteğinin etkinleştirilip etkinleştirilmeyeceğini gösteren bir değer döndürür. |
| [get_EnableScript](./get_enablescript/)() | Gömülü betik blokları desteğinin etkinleştirilip etkinleştirilmeyeceğini gösteren bir değer döndürür. |
| static [get_TrustedXslt](./get_trustedxslt/)() | XSLT **document()** işlevi ve gömülü betik blokları desteğini etkinleştiren bir [XsltSettings](./) nesnesi döndürür. |
| [set_EnableDocumentFunction](./set_enabledocumentfunction/)(bool) | XSLT **document()** işlevi desteğinin etkinleştirilip etkinleştirilmeyeceğini belirten bir değer ayarlar. |
| [set_EnableScript](./set_enablescript/)(bool) | Gömülü betik blokları desteğinin etkinleştirilip etkinleştirilmeyeceğini belirten bir değer ayarlar. |
| [XsltSettings](./xsltsettings/)() | Varsayılan ayarlarla [XsltSettings](./) sınıfının yeni bir örneğini başlatır. |
| [XsltSettings](./xsltsettings/)(bool, bool) | Belirtilen ayarlarla [XsltSettings](./) sınıfının yeni bir örneğini başlatır. |
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
