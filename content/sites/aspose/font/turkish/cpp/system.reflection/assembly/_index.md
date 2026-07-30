---
title: "System::Reflection::Assembly sınıfı"
linktitle: "Assembly"
second_title: "Aspose.Font için C++"
description: "System::Reflection::Assembly sınıfı. Derlemeyi tanımlayan yansıma sınıfı. C# ile C++ arasındaki kurallar oldukça farklı olduğundan destek sınırlıdır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da operator new ile asla oluşturmayın, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.reflection/assembly/
---
## Assembly class


[Reflection](../) class describing assembly. Support is limited as the rules are quite different between C# and C++. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Assembly : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Assembly](./assembly/)() | Yapıcı. |
| virtual [get_CodeBase](./get_codebase/)() const | Mevcut derlemenin dizinini alır. Destek sınırlıdır. |
| virtual [get_FullName](./get_fullname/)() const | Derlemenin tam adını alır. |
| virtual [get_Location](./get_location/)() const | Derleme konumunu alır. Henüz uygulanmadı. |
| static [GetAssembly](./getassembly/)(const TypeInfo\&) | Belirli bir türü tanımlayan derlemeyi alır. |
| static [GetCallingAssembly](./getcallingassembly/)() | Çağıran derlemeyi alır. |
| static [GetEntryAssembly](./getentryassembly/)() | Giriş derlemesini alır. |
| static [GetExecutingAssembly](./getexecutingassembly/)() | Çalıştırılan derlemeyi alır. |
| virtual [GetManifestResourceNames](./getmanifestresourcenames/)() const | Manifest kaynaklarının adlarını alır. |
| virtual [GetManifestResourceStream](./getmanifestresourcestream/)(String) const | Manifest kaynağına bağlı akışı alır. |
| virtual [GetName](./getname/)() const | Derleme adını alır. |
| virtual [GetTypes](./gettypes/)() const | Derleme tarafından bildirilen türleri alır. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
