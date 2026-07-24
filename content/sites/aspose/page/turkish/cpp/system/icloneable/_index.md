---
title: "System::ICloneable sınıfı"
linktitle: "ICloneable"
second_title: "Aspose.Page için C++"
description: "System::ICloneable sınıfı. Nesne klonlamayı sağlayan bir yöntem tanımlar – bir nesnenin kopyasını oluşturur. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu türden bir örnek asla yığına (stack) ya da operator new ile oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3200
url: /tr/cpp/system/icloneable/
---
## ICloneable class


Nesne klonlamayı sağlayan bir yöntem tanımlar – bir nesnenin kopyasını oluşturur. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden bir örnek asla yığına (stack) ya da operator new ile oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class ICloneable : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Clone](./clone/)() | RTTI bilgisi. |
## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
