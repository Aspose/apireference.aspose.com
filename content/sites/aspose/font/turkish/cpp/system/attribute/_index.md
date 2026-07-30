---
title: "System::Attribute sınıfı"
linktitle: "Attribute"
second_title: "Aspose.Font için C++"
description: "System::Attribute sınıfı. Özel öznitelikler için temel sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve C++'ta fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın."
type: docs
weight: 400
url: /tr/cpp/system/attribute/
---
## Attribute class


Özel öznitelikler için temel sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın.

```cpp
class Attribute : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&, const TypeInfo\&) | Belirtilen türe uygulanan belirtilen türdeki özel özniteliği döndürür. |
| static [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&) | Belirtilen türe uygulanan tüm özel öznitelikleri döndürür. |
## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
