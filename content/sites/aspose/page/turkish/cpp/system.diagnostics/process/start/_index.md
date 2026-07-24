---
title: "System::Diagnostics::Process::Start yöntemi"
linktitle: "Başlat"
second_title: "Aspose.Page için C++"
description: "System::Diagnostics::Process::Start yöntemi. C++'ta önceden tanımlı parametrelerle süreci başlatır."
type: docs
weight: 1200
url: /tr/cpp/system.diagnostics/process/start/
---
## Process::Start() method


Önceden tanımlı parametrelerle süreci başlatır.

```cpp
bool System::Diagnostics::Process::Start()
```

## Ayrıca Bakınız

* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Page for C++](../../../)
## Process::Start(const SharedPtr\<ProcessStartInfo\>\&) method


Belirtilen yol ve argümanlarla süreci başlatır.

```cpp
static SharedPtr<Process> System::Diagnostics::Process::Start(const SharedPtr<ProcessStartInfo> &start_info)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| start_info | const SharedPtr\<ProcessStartInfo\>\& | Başlatılacak süreç hakkında bilgi. |

### ReturnValue

[Object](../../../system/object/) attached to newly started process.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Process](../)
* Class [ProcessStartInfo](../../processstartinfo/)
* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Page for C++](../../../)
## Process::Start(const String\&, const String\&) method


Belirtilen yol ve argümanlarla süreci başlatır.

```cpp
static SharedPtr<Process> System::Diagnostics::Process::Start(const String &filename, const String &arguments=String::Empty)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| filename | const String\& | [Process](../) yolu. |
| arguments | const String\& | [Process](../) parametreleri. |

### ReturnValue

[Object](../../../system/object/) attached to newly started process.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Process](../)
* Class [String](../../../system/string/)
* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Page for C++](../../../)
