---
title: "System::IFormatProvider sınıfı"
linktitle: "IFormatProvider"
second_title: "Aspose.Font için C++"
description: "System::IFormatProvider sınıfı. Biçimlendirme bilgisi sağlayan bir yöntem tanımlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin bir örneğini yığına (stack) ya da new operatörüyle oluşturmaya çalışmayın; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3800
url: /tr/cpp/system/iformatprovider/
---
## IFormatProvider class


Biçimlendirme bilgisi sağlayan bir yöntem tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin bir örneğini yığına (stack) ya da new operatörüyle oluşturmaya çalışmayın; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class IFormatProvider : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [GetFormat](./getformat/)(const TypeInfo\&) | Belirtilen tip için biçimlendirme hizmeti sağlayan bir nesne döndürür. |
## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
