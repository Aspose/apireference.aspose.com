---
title: "Aspose::Page::Metered 클래스"
linktitle: "Metered"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::Metered 클래스. C++에서 계량 키를 설정하는 메서드를 제공합니다."
type: docs
weight: 1400
url: /ko/cpp/aspose.page/metered/
---
## Metered class


계량 키를 설정하는 메서드를 제공합니다.

```cpp
class Metered : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [GetConsumptionCredit](./getconsumptioncredit/)() | 소비 크레딧을 가져옵니다. |
| static [GetConsumptionQuantity](./getconsumptionquantity/)() | 소비 파일 크기를 가져옵니다. |
| [Metered](./metered/)() | 이 클래스의 새 인스턴스를 초기화합니다. |
| [SetMeteredKey](./setmeteredkey/)(System::String, System::String) | 계량 공개 및 개인 키를 설정합니다. 계량 라이선스를 구매한 경우 애플리케이션을 시작할 때 이 API를 호출해야 하며, 일반적으로 이것만으로 충분합니다. 그러나 소비 데이터 업로드가 계속 실패하고 24시간을 초과하면 라이선스가 평가 상태로 전환됩니다. 이러한 경우를 방지하려면 라이선스 상태를 정기적으로 확인하고, 평가 상태인 경우 이 API를 다시 호출해야 합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
