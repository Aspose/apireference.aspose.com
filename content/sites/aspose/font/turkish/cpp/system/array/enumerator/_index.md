---
title: "System::Array::Enumerator sınıfı"
linktitle: "İteratör"
second_title: "Aspose.Font için C++"
description: "System::Array::Enumerator sınıfı. Elemanların bir Array nesnesinde yinelemesini sağlayan IEnumerator arayüzünü uygular. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığını (stack) üzerinde veya operator new kullanarak bu tipin örneğini asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 6800
url: /tr/cpp/system/array/enumerator/
---
## Enumerator class


IEnumerator arayüzünü uygular ve bir [Array](../) nesnesinin elemanlarının yinelemesini sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını (stack) üzerinde veya operator new kullanarak bu tipin örneğini asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<T>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<Array\<T\>\>\&) | Belirtilen diziyi temsil eden yeni bir [Enumerator](./) nesnesi oluşturur. |
| [get_Current](./get_current/)() const override | Geçerli elemanın bir kopyasını döndürür. |
| [MoveNext](./movenext/)() override | Geçerli elemanın dizindeki indeksi son elemana işaret etmiyorsa kontrol eder ve işaret etmiyorsa ilerletir. |
| [Reset](./reset/)() override | Geçerli elemanın indeksini sıfırlar. |
| virtual [~Enumerator](./~enumerator/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
