---
title: "System::ComponentModel::BackgroundWorker::ReportProgress मेथड"
linktitle: "ReportProgress"
second_title: "Aspose.Page C++ के लिए"
description: "System::ComponentModel::BackgroundWorker::ReportProgress मेथड. C++ में System::ComponentModel::BackgroundWorker::ProgressChanged इवेंट को उठाता है।"
type: docs
weight: 400
url: /hi/cpp/system.componentmodel/backgroundworker/reportprogress/
---
## BackgroundWorker::ReportProgress(int) method


**System::ComponentModel::BackgroundWorker::ProgressChanged** इवेंट को उठाता है।

```cpp
void System::ComponentModel::BackgroundWorker::ReportProgress(int percentProgress)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| percentProgress | int | प्रतिशत, 0 से 100 तक, बैकग्राउंड ऑपरेशन का जो पूर्ण हो चुका है। |

## संबंधित देखें

* Class [BackgroundWorker](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
## BackgroundWorker::ReportProgress(int, const System::SharedPtr\<System::Object\>\&) method


userState ऑब्जेक्ट के साथ **System::ComponentModel::BackgroundWorker::ProgressChanged** इवेंट को उठाता है।

```cpp
void System::ComponentModel::BackgroundWorker::ReportProgress(int percentProgress, const System::SharedPtr<System::Object> &userState)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| percentProgress | int | प्रतिशत, 0 से 100 तक, बैकग्राउंड ऑपरेशन का जो पूर्ण हो चुका है। |
| userState | const System::SharedPtr\<System::Object\>\& | वह स्टेट ऑब्जेक्ट जो System::ComponentModel::BackgroundWorker::RunWorkerAsync(System::Object) को पास किया जाता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [BackgroundWorker](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
