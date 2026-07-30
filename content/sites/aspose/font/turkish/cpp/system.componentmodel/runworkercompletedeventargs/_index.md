---
title: "System::ComponentModel::RunWorkerCompletedEventArgs class"
linktitle: "RunWorkerCompletedEventArgs"
second_title: "Aspose.Font için C++"
description: "System::ComponentModel::RunWorkerCompletedEventArgs sınıfı. Bu sınıfın bir örneği, RunWorkerCompletedEventHandler temsilcisine argüman olarak geçirilir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1300
url: /tr/cpp/system.componentmodel/runworkercompletedeventargs/
---
## RunWorkerCompletedEventArgs class


Bu sınıfın bir örneği, RunWorkerCompletedEventHandler temsilcisine argüman olarak geçirilir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class RunWorkerCompletedEventArgs : public System::ComponentModel::AsyncCompletedEventArgs
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Result](./get_result/)() const | Asenkron bir işlemin sonucunu temsil eden değeri alır. |
| [RunWorkerCompletedEventArgs](./runworkercompletedeventargs/)(const System::SharedPtr\<System::Object\>\&, const System::Exception\&, bool) | RTTI bilgisi. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Boş bir [EventArgs](../../system/eventargs/) paylaşımlı işaretçiyi (null-pointer) temsil eden statik bir üye. |
## Ayrıca Bakınız

* Class [AsyncCompletedEventArgs](../asynccompletedeventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
