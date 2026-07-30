---
title: "System::IDisposable sınıfı"
linktitle: "IDisposable"
second_title: "Aspose.Font için C++"
description: "System::IDisposable sınıfı. Mevcut nesnenin sahip olduğu kaynakları serbest bırakan yöntemi tanımlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığını (stack) üzerinde veya new operatörüyle bu tipin örneği oluşturulmayın, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları oluşur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 3600
url: /tr/cpp/system/idisposable/
---
## IDisposable class


Mevcut nesnenin sahip olduğu kaynakları serbest bırakan yöntemi tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını (stack) üzerinde veya new operatörüyle bu tipin örneği oluşturulmayın, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları oluşur. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class IDisposable : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Dispose](./dispose/)() | Hiçbir şey yapmaz. |
## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
