---
title: "System::Diagnostics::Process::Start मेथड"
linktitle: "शुरू"
second_title: "Aspose.Page C++ के लिए"
description: "System::Diagnostics::Process::Start मेथड। C++ में पूर्व-परिभाषित पैरामीटरों के साथ प्रक्रिया शुरू करता है।"
type: docs
weight: 1200
url: /hi/cpp/system.diagnostics/process/start/
---
## Process::Start() method


पूर्व-परिभाषित पैरामीटरों के साथ प्रक्रिया शुरू करता है।

```cpp
bool System::Diagnostics::Process::Start()
```

## संबंधित देखें

* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Page for C++](../../../)
## Process::Start(const SharedPtr\<ProcessStartInfo\>\&) method


निर्दिष्ट पथ और तर्कों के साथ प्रक्रिया शुरू करता है।

```cpp
static SharedPtr<Process> System::Diagnostics::Process::Start(const SharedPtr<ProcessStartInfo> &start_info)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| start_info | const SharedPtr\<ProcessStartInfo\>\& | शुरू करने के लिए प्रक्रिया की जानकारी। |

### ReturnValue

[Object](../../../system/object/) attached to newly started process.

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Process](../)
* Class [ProcessStartInfo](../../processstartinfo/)
* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Page for C++](../../../)
## Process::Start(const String\&, const String\&) method


निर्दिष्ट पथ और तर्कों के साथ प्रक्रिया शुरू करता है।

```cpp
static SharedPtr<Process> System::Diagnostics::Process::Start(const String &filename, const String &arguments=String::Empty)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| filename | const String\& | [Process](../) पथ। |
| arguments | const String\& | [Process](../) पैरामीटर। |

### ReturnValue

[Object](../../../system/object/) attached to newly started process.

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Process](../)
* Class [String](../../../system/string/)
* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Page for C++](../../../)
