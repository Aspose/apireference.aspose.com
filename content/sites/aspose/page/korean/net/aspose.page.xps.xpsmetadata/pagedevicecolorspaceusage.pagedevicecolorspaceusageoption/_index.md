---
title: Class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.PageDeviceColorSpaceUsagePageDeviceColorSpaceUsageOption 수업. 설명PageDeviceColorSpaceUsage 기능 옵션.
type: docs
weight: 1940
url: /ko/net/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption class

설명[`PageDeviceColorSpaceUsage`](../pagedevicecolorspaceusage/) 기능 옵션.

```csharp
public sealed class PageDeviceColorSpaceUsageOption : Option
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 요소 이름을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/option/add/)(params IOptionItem[]) | 이 옵션의 항목 목록 끝에 항목 목록을 추가합니다. 각각은[`ScoredProperty`](../scoredproperty/) 또는[`Property`](../property/) 인스턴스. |

## 필드

| 이름 | 설명 |
| --- | --- |
| static [MatchToDefault](../../aspose.page.xps.xpsmetadata/pagedevicecolorspaceusageoption/matchtodefault/) | 장치가 지정한 프로파일이[`PageDeviceColorSpaceProfileURI`](../pagedevicecolorspaceprofileuri/) parameter 는 장치 색 공간 프로필로 사용할 수 있으며 동일한 프로필을 사용하는 모든 요소는 장치 색 공간에서 이미 지정된 로 처리됩니다. 다른 모든 요소는 해당 요소에 대해 지정된 프로필을 사용해야 합니다. 프로필을 장치 색상 공간 프로필로 사용할 수 없는 경우 프로필을 사용하는 요소는 색상 프로필을 사용하는 다른 요소처럼 색상을 관리해야 합니다. |
| static [OverrideDeviceDefault](../../aspose.page.xps.xpsmetadata/pagedevicecolorspaceusageoption/overridedevicedefault/) | PageDeviceColorSpaceProfileURI 매개변수에 의해 지정된 프로필이 장치의 기본 수 와 일치하는 채널 수가 있는 경우 모든 요소에 대한 장치 내부 색상 관리 대신 사용해야 합니다. 이 프로필을 사용하는 요소는 장치 색상에 있다고 가정합니다. 더 이상 색상이 관리되지 않습니다. |

### 또한보십시오

* class [Option](../option/)
* class [PageDeviceColorSpaceUsage](../pagedevicecolorspaceusage/)
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


