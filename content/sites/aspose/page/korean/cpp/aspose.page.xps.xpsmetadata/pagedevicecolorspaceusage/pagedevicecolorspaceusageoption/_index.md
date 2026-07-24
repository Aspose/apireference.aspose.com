---
title: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption 클래스"
linktitle: "PageDeviceColorSpaceUsageOption"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption 클래스. C++에서 PageDeviceColorSpaceUsage 기능 옵션을 설명합니다."
type: docs
weight: 200
url: /ko/cpp/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage/pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsageOption class


다음의 [PageDeviceColorSpaceUsage](../) 기능 옵션을 설명합니다.

```cpp
class PageDeviceColorSpaceUsageOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## 필드

| 필드 | 설명 |
| --- | --- |
| static [MatchToDefault](./matchtodefault/) | 장치가 [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) 매개변수에 지정된 프로파일을 장치 색상 공간 프로파일로 사용할 수 있다고 판단하면, 동일한 프로파일을 사용하는 모든 요소는 이미 장치 색상 공간으로 지정된 것으로 처리됩니다. 다른 모든 요소는 해당 요소에 지정된 프로파일을 사용해야 합니다. MUST. 프로파일을 장치 색상 공간 프로파일로 사용할 수 없는 경우, 해당 프로파일을 사용하는 요소는 다른 색상 프로파일을 사용하는 요소와 마찬가지로 색상 관리되어야 합니다. MUST. |
| static [OverrideDeviceDefault](./overridedevicedefault/) | 프로파일이 [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) 매개변수에 지정되어 장치의 기본 색상 수와 일치하는 채널 수를 가지고 있는 경우, 장치의 내부 색상 관리 대신 사용되어야 합니다. SHOULD. 이 프로파일을 사용하는 요소들은 장치 색상 공간에 있는 것으로 간주되며 더 이상 색상 관리되지 않습니다. |
## 또 보기

* Class [Option](../../option/)
* Class [PageDeviceColorSpaceUsage](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
