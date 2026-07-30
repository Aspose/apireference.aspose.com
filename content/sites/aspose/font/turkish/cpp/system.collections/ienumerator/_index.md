---
title: "System::Collections::IEnumerator sınıfı"
linktitle: "IEnumerator"
second_title: "Aspose.Font için C++"
description: "System::Collections::IEnumerator sınıfı. Bazı öğeler üzerinde yineleme yapmak için kullanılabilecek bir enumerator arayüzü. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarmalayın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 600
url: /tr/cpp/system.collections/ienumerator/
---
## IEnumerator class


Bazı öğeler üzerinde yineleme yapmak için kullanılabilecek bir enumerator arayüzü. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class IEnumerator : public virtual System::IDisposable,
                    public virtual System::Object
```


| Parametre | Açıklama |
| --- | --- |
| T | Eleman tipi. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Current](./current/)() const | Geçerli öğeyi alır. |
| virtual [get_Current](./get_current/)() const | Geçerli öğeyi alır. |
| virtual [MoveNext](./movenext/)() | Enumerator'ı bir sonraki elemana taşır. Daha önce bir elemana referans verilmemişse, referansı mevcut ilk elemana ayarlar. Eğer konteyner sonuna gelinmişse, hiçbir şey yapmaz. |
| virtual [Reset](./reset/)() | Enumeratörü ilk öğeden önceki konuma sıfırlar. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ValueType](./valuetype/) | RTTI bilgisi. |

## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Class [Object](../../system/object/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
