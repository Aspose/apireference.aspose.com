---
title: "System::Delegate< ReturnType(ArgumentTypes...)> class"
linktitle: "Delegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Delegate< ReturnType(ArgumentTypes...)>. Mewakili pointer ke fungsi, metode, atau objek fungsi. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas System::SmartPtr untuk mengelola objek tipe ini di C++."
type: docs
weight: 2100
url: /id/cpp/system/delegate_returntype(argumenttypes...)_/
---
## Delegate< ReturnType(ArgumentTypes...)> class


Mewakili pointer ke fungsi, metode, atau objek fungsi. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas [System::SmartPtr](../smartptr/) untuk mengelola objek tipe ini.

```cpp
template<class ReturnType,class...>class Delegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| Parameter | Deskripsi |
| --- | --- |
| ReturnType | Tipe nilai kembali dari fungsi, metode, atau objek fungsi yang pointernya diwakili oleh kelas ini |
| ArgumentTypes | Daftar argumen dari fungsi, metode, atau objek fungsi yang pointernya diwakili oleh kelas ini |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Delegate](./delegate/)() | Konstruktor default. Membuat objek delegate yang tidak menunjuk ke apa pun. |
| [Delegate](./delegate/)(const Delegate\&) |  |
| [Delegate](./delegate/)(Delegate\&&) | Konstruktor penyalinan bergerak. Mengambil kepemilikan entitas yang ditunjuk oleh delegate yang ditentukan. |
| [Delegate](./delegate/)(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) | Konstruktor. Membuat objek delegate dari pointer yang ditentukan ke fungsi bebas atau metode statis. |
| [Delegate](./delegate/)(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) | Konstruktor. Membuat delegate dari pointer yang ditentukan ke objek fungsi yang dihasilkan oleh std::bind(). |
| [Delegate](./delegate/)(int, T\&) | Konstruktor. Membuat delegate dari objek fungsi yang ditentukan. |
| [Delegate](./delegate/)(long, T\&&) | Konstruktor bergerak. Membuat delegate dari objek fungsi yang ditentukan. |
| [Delegate](./delegate/)(MemberType ClassType::*, ClassType *) | Konstruktor. Membuat delegate yang menunjuk ke metode non-statis yang ditentukan dari objek yang ditentukan. |
| [Delegate](./delegate/)(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) | Konstruktor. Membuat delegate yang menunjuk ke metode non-statis yang ditentukan dari objek yang ditentukan. |
| [Delegate](./delegate/)(std::function\<R(Args...)>) | Membuat objek delegate yang menunjuk ke objek fungsi std::function. |
| [Empty](./empty/)() const | Menentukan apakah objek delegate saat ini kosong, misalnya tidak menunjuk ke entitas apa pun. |
| [operator()](./operator()/)(ArgumentTypes...) const | Memanggil fungsi, metode, atau objek fungsi yang ditunjuk oleh objek delegate saat ini. |
| [operator=](./operator=/)(const Delegate\&) |  |
| [operator=](./operator=/)(Delegate\&&) | Operator penugasan bergerak. Mengambil kepemilikan entitas yang ditunjuk oleh delegate yang ditentukan. |
| [operator==](./operator==/)(const Delegate\&) const | Membandingkan dua objek delegate untuk memeriksa apakah mereka menunjuk ke entitas yang sama. |
## Catatan



```cpp
#include "system/delegate.h"
#include <iostream>

// Deklarasikan delegate.
using Message = System::Delegate<void()>;

void PrintMessage()
{
  std::cout << "Hello, world!" << std::endl;
}

int main()
{
  // Tetapkan ke variabel alamat fungsi PrintMessage.
  Message mes = Message(&PrintMessage);

  // Panggil fungsi tersebut.
  mes();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
