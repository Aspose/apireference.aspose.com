---
title: "System::Delegate< ReturnType(ArgumentTypes...)> sınıfı"
linktitle: "Delegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Font için C++"
description: "System::Delegate< ReturnType(ArgumentTypes...)> sınıfı. Bir fonksiyon, yöntem veya fonksiyon nesnesine işaretçi temsil eder. Bu tip yığıt üzerinde ayrılmalı ve fonksiyonlara değer ya da referans olarak geçirilmelidir. C++'da bu tipin nesnelerini yönetmek için System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 2100
url: /tr/cpp/system/delegate_returntype(argumenttypes...)_/
---
## Delegate< ReturnType(ArgumentTypes...)> class


Bir fonksiyon, yöntem veya fonksiyon nesnesine işaretçi temsil eder. Bu tip yığıt üzerinde ayrılmalı ve fonksiyonlara değer ya da referans olarak geçirilmelidir. Bu tipin nesnelerini yönetmek için [System::SmartPtr](../smartptr/) sınıfını asla kullanmayın.

```cpp
template<class ReturnType,class...>class Delegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| Parametre | Açıklama |
| --- | --- |
| ReturnType | Sınıf tarafından temsil edilen bir fonksiyon, yöntem veya fonksiyon nesnesi işaretçisinin dönüş tipi |
| ArgumentTypes | Sınıf tarafından temsil edilen bir fonksiyon, metod veya fonksiyon nesnesi işaretçisinin argüman listesi |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Delegate](./delegate/)() | Varsayılan yapıcı. Hiçbir şeye işaret etmeyen delege nesnesini oluşturur. |
| [Delegate](./delegate/)(const Delegate\&) |  |
| [Delegate](./delegate/)(Delegate\&&) | Taşıma kopya yapıcı. Belirtilen delege tarafından işaret edilen varlığın sahipliğini alır. |
| [Delegate](./delegate/)(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) | Yapıcı. Belirtilen serbest fonksiyon veya statik metoda işaretçiden bir delege nesnesi oluşturur. |
| [Delegate](./delegate/)(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) | Yapıcı. std::bind() tarafından oluşturulan fonksiyon nesnesine işaret eden belirtilen işaretçiden bir delege oluşturur. |
| [Delegate](./delegate/)(int, T\&) | Yapıcı. Belirtilen fonksiyon nesnesinden bir delege oluşturur. |
| [Delegate](./delegate/)(long, T\&&) | Taşıma yapıcı. Belirtilen fonksiyon nesnesinden bir delege oluşturur. |
| [Delegate](./delegate/)(MemberType ClassType::*, ClassType *) | Yapıcı. Belirtilen nesnenin belirtilen statik olmayan metoduna işaret eden bir delege oluşturur. |
| [Delegate](./delegate/)(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) | Yapıcı. Belirtilen nesnenin belirtilen statik olmayan metoduna işaret eden bir delege oluşturur. |
| [Delegate](./delegate/)(std::function\<R(Args...)>) | Bir std::function fonksiyon nesnesine işaret eden bir delege nesnesi oluşturur. |
| [Empty](./empty/)() const | Mevcut delege nesnesinin boş olup olmadığını belirler, ör. herhangi bir varlığa işaret etmiyorsa. |
| [operator()](./operator()/)(ArgumentTypes...) const | Mevcut delege nesnesi tarafından işaret edilen bir fonksiyon, metod veya fonksiyon nesnesini çağırır. |
| [operator=](./operator=/)(const Delegate\&) |  |
| [operator=](./operator=/)(Delegate\&&) | Taşıma atama operatörü. Belirtilen delege tarafından işaret edilen varlığın sahipliğini alır. |
| [operator==](./operator==/)(const Delegate\&) const | İki delege nesnesini karşılaştırarak aynı varlığa işaret edip etmediklerini kontrol eder. |
## Açıklamalar



```cpp
#include "system/delegate.h"
#include <iostream>

// Delegeyi bildir.
using Message = System::Delegate<void()>;

void PrintMessage()
{
  std::cout << "Hello, world!" << std::endl;
}

int main()
{
  // Değişkene PrintMessage fonksiyonunun adresini ata.
  Message mes = Message(&PrintMessage);

  // Fonksiyonu çağır.
  mes();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
