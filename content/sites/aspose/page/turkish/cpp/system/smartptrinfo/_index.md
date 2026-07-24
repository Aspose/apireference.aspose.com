---
title: "System::SmartPtrInfo class"
linktitle: "SmartPtrInfo"
second_title: "Aspose.Page için C++"
description: "System::SmartPtrInfo class. Final tipi bilmeden SmartPtr'in içeriğini test etmek ve değiştirmek için hizmet sınıfı. Çöp toplama ve döngü referanslarının tespiti vb. için kullanılır. Bunu ''pointer to pointer'' (işaretçiden işaretçiye) gibi düşünün. SmartPtr'in temel tipini kullanamıyoruz çünkü yok; bunun yerine C++'da bu ''info'' sınıfını kullanıyoruz."
type: docs
weight: 5600
url: /tr/cpp/system/smartptrinfo/
---
## SmartPtrInfo class


Final tipi bilmeden [SmartPtr](../smartptr/)'in içeriğini test etmek ve değiştirmek için hizmet sınıfı. Çöp toplama ve döngü referanslarının tespiti vb. için kullanılır. Bunu 'pointer to pointer' (işaretçiden işaretçiye) gibi düşünün. [SmartPtr](../smartptr/)'in temel tipini kullanamıyoruz çünkü yok; bunun yerine bu 'info' sınıfını kullanıyoruz.

```cpp
class SmartPtrInfo
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [getInternalPtr](./getinternalptr/)() const | İşaret edilen ham nesnenin işaret ettiği nesneyi alır. |
| [getObject](./getobject/)() const | İşaret edilen nesnenin işaret ettiği nesneyi alır. |
| [getOwned](./getowned/)() const | Nesnenin sahip olduğu işaretçiyi alır. |
| [operator bool](./operatorbool/)() const | Info nesnesinin null olmayan bir işaretçiye işaret edip etmediğini kontrol eder. |
| [operator!](./operator!/)() const | Info nesnesinin null olmayan bir işaretçiye işaret etmediğini kontrol eder. |
| [operator->](./operator-_/)() const | İşaret edilen işaretçi tarafından işaret edilen [Object](../object/) nesnesinin yöntemlerini çağırmaya izin verir. |
| [operator<](./operator_/)(const SmartPtrInfo\&) const | Less iki bilgi nesnesi tarafından referans verilen işaretçilerin değerlerini karşılaştırır. |
| [SmartPtrInfo](./smartptrinfo/)() | Boş bir [SmartPtrInfo](./) nesnesi oluşturur. |
| explicit [SmartPtrInfo](./smartptrinfo/)(const SmartPtr\<T\>\&) | Belirli bir akıllı işaretçi hakkında bilgi içeren bir [SmartPtrInfo](./) nesnesi oluşturur. |
## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
