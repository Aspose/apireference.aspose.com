---
title: "System::Diagnostics::ProcessStartInfo sınıfı"
linktitle: "ProcessStartInfo"
second_title: "Aspose.Font için C++"
description: "System::Diagnostics::ProcessStartInfo sınıfı. İşlem başlatma parametrelerini tanımlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da operator new kullanılarak oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 400
url: /tr/cpp/system.diagnostics/processstartinfo/
---
## ProcessStartInfo class


İşlem başlatma parametrelerini tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da operator new kullanılarak oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class ProcessStartInfo : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Arguments](./get_arguments/)() const | İşlem argümanlarını alır. |
| [get_CreateNoWindow](./get_createnowindow/)() const | NoWindow özelliğini alır. |
| [get_EnvironmentVariables](./get_environmentvariables/)() const | İşlem ortam değişkenlerini alır. |
| [get_FileName](./get_filename/)() const | İşlem dosya adını alır. |
| [get_RedirectStandardError](./get_redirectstandarderror/)() const | RedirectStandardError özelliğini alır. |
| [get_RedirectStandardInput](./get_redirectstandardinput/)() const | RedirectStandardInput özelliğini alır. |
| [get_RedirectStandardOutput](./get_redirectstandardoutput/)() const | RedirectStandardOutput özelliğini alır. |
| [get_UseShellExecute](./get_useshellexecute/)() const | UseShellExecute özelliğini alır. |
| [get_WindowStyle](./get_windowstyle/)() const | Pencere stilini alır. |
| [get_WorkingDirectory](./get_workingdirectory/)() const | İşlemin çalışma dizinini alır. |
| [ProcessStartInfo](./processstartinfo/)() | Boş başlangıç bilgisi nesnesi oluşturur. |
| [ProcessStartInfo](./processstartinfo/)(const String\&) | Başlangıç bilgisi nesnesi oluşturur. |
| [ProcessStartInfo](./processstartinfo/)(const String\&, const String\&) | Başlangıç bilgisi nesnesi oluşturur. |
| [set_Arguments](./set_arguments/)(const String\&) | İşlem argümanlarını ayarlar. |
| [set_CreateNoWindow](./set_createnowindow/)(bool) | NoWindow özelliğini ayarlar. |
| [set_FileName](./set_filename/)(const String\&) | İşlem dosya adını ayarlar. |
| [set_RedirectStandardError](./set_redirectstandarderror/)(bool) | RedirectStandardError özelliğini ayarlar. |
| [set_RedirectStandardInput](./set_redirectstandardinput/)(bool) | RedirectStandardInput özelliğini ayarlar. |
| [set_RedirectStandardOutput](./set_redirectstandardoutput/)(bool) | RedirectStandardOutput özelliğini ayarlar. |
| [set_UseShellExecute](./set_useshellexecute/)(bool) | UseShellExecute özelliğini ayarlar. |
| [set_WindowStyle](./set_windowstyle/)(ProcessWindowStyle) | Pencere stilini ayarlar. |
| [set_WorkingDirectory](./set_workingdirectory/)(const String\&) | İşlemin çalışma dizinini ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
