---
title: "System::Diagnostics::Process class"
linktitle: "Process"
second_title: "Aspose.Font için C++"
description: "System::Diagnostics::Process sınıfı. Süreç bilgilerini ve işlemlerini kapsar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'de fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 300
url: /tr/cpp/system.diagnostics/process/
---
## Process class


Süreç bilgilerini ve işlemlerini kapsar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Process : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_EnableRaisingEvents](./get_enableraisingevents/)() const | Süreç sonlandığında Exited olayının yükseltilip yükseltilmeyeceğini alır. |
| [get_ExitCode](./get_exitcode/)() const | Süreç çıkış kodunu alır. |
| [get_PrivateMemorySize64](./get_privatememorysize64/)() const | Süreç özel bellek kümesi boyutunu alır. |
| [get_ProcessName](./get_processname/)() const | Süreç adını alır. |
| [get_StandardError](./get_standarderror/)() const | İşlem hata çıktısından okumak için bir okuyucu sağlar. Henüz uygulanmadı. |
| [get_StandardOutput](./get_standardoutput/)() const | İşlem standart çıktısından okumak için bir okuyucu sağlar. Henüz uygulanmadı. |
| [get_StartInfo](./get_startinfo/)() const | İşlem başlangıç bilgilerini alır. |
| [get_WorkingSet64](./get_workingset64/)() const | İşlem bellek çalışma kümesi boyutunu alır. |
| static [GetCurrentProcess](./getcurrentprocess/)() | Geçerli işlem hakkında bilgi alır. [Windows](../../system.windows/) yalnız. |
| [GetOutputText](./getoutputtext/)() const | İşlem çıktı metnini alır. |
| [set_EnableRaisingEvents](./set_enableraisingevents/)(bool) | İşlem sonlandığında Exited olayının tetiklenip tetiklenmeyeceğini ayarlar. |
| [Start](./start/)() | Önceden tanımlı parametrelerle işlemi başlatır. |
| static [Start](./start/)(const String\&, const String\&) | Belirtilen yol ve argümanlarla işlemi başlatır. |
| static [Start](./start/)(const SharedPtr\<ProcessStartInfo\>\&) | Belirtilen yol ve argümanlarla işlemi başlatır. |
| [WaitForExit](./waitforexit/)(int) | İşlemin çıkmasını bekler. Henüz uygulanmadı. |
| [WaitForExit](./waitforexit/)() | İşlemin çıkmasını bekler, bitene kadar geri dönmez. |
| virtual [~Process](./~process/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
