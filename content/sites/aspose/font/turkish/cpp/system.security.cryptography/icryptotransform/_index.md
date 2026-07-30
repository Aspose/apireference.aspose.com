---
title: "System::Security::Cryptography::ICryptoTransform class"
linktitle: "ICryptoTransform"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::ICryptoTransform sınıfı. Kriptografik dönüştürücünün temel sınıfı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2000
url: /tr/cpp/system.security.cryptography/icryptotransform/
---
## ICryptoTransform class


Kriptografik dönüştürücünün temel sınıfı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class ICryptoTransform : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Giriş blok boyutu. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Çıkış blok boyutu. |
| virtual [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) | RTTI bilgisi. |
| virtual [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) | Verinin son bloğunu işler ve çıktı değerini hesaplar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
