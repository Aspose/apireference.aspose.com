---
title: "System::EventArgs sınıfı"
linktitle: "EventArgs"
second_title: "Aspose.Font için C++"
description: "System::EventArgs sınıfı. Bir olay tetiklendiğinde olay abonelerine iletilen bağlamı temsil eden sınıflar için temel sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığıt (stack) üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2500
url: /tr/cpp/system/eventargs/
---
## EventArgs class


Olay tetiklendiğinde olay abonelerine iletilen bağlamı temsil eden sınıflar için temel sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class EventArgs : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [EventArgs](./eventargs/)() | Yapıcı. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](./empty/) | Boş bir [EventArgs](./) paylaşımlı işaretçiyi (null-pointer) temsil eden statik bir üye. |
## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
