---
title: "System::Array::Enumerator sınıfı"
linktitle: "Enumerator"
second_title: "Aspose.Page için C++"
description: "System::Array::Enumerator sınıfı. Bir Array nesnesinin öğelerinin yinelemesini sağlayan IEnumerator arayüzünü uygular. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığın üzerinde veya new operatörüyle bu tipin örneği oluşturulmaz; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 6800
url: /tr/cpp/system/array/enumerator/
---
## Enumerator class


IEnumerator arayüzünü uygular; bu arayüz bir [Array](../) nesnesinin öğelerinin yinelemesini sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../makeobject/) işlevi kullanılarak ayrılmalıdır. Yığın üzerinde veya new operatörüyle bu tipin örneği oluşturulmaz; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<T>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<Array\<T\>\>\&) | Belirtilen diziyi temsil eden yeni bir [Enumerator](./) nesnesi oluşturur. |
| [get_Current](./get_current/)() const override | Geçerli öğenin bir kopyasını döndürür. |
| [MoveNext](./movenext/)() override | Geçerli öğenin dizindeki indeksinin dizinin son öğesine işaret edip etmediğini kontrol eder ve işaret etmiyorsa ilerletir. |
| [Reset](./reset/)() override | Geçerli öğenin indeksini sıfırlar. |
| virtual [~Enumerator](./~enumerator/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
