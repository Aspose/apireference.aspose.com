---
title: "Aspose::Page::Plugins::IPlugin::Process 메서드"
linktitle: "Process"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::Plugins::IPlugin::Process 메서드. 정의된 옵션으로 플러그인을 처리하도록 지시합니다."
type: docs
weight: 100
url: /ko/cpp/aspose.page.plugins/iplugin/process/
---
## IPlugin::Process method


정의된 옵션으로 플러그인에게 처리를 요청합니다.

```cpp
virtual System::SharedPtr<ResultContainer> Aspose::Page::Plugins::IPlugin::Process(System::SharedPtr<IPluginOptions> options)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 옵션 | System::SharedPtr\<IPluginOptions\> | 플러그인에 대한 지시를 포함하는 옵션 객체 |

### ReturnValue

처리 결과를 포함하는 [ResultContainer](../../resultcontainer/) 객체

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ResultContainer](../../resultcontainer/)
* Class [IPluginOptions](../../ipluginoptions/)
* Class [IPlugin](../)
* Namespace [Aspose::Page::Plugins](../../)
* Library [Aspose.Page for C++](../../../)
