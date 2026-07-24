---
title: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption 클래스"
linktitle: "PageMediaTypeOption"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption 클래스. C++에서 PageMediaType 기능 옵션을 설명합니다."
type: docs
weight: 700
url: /ko/cpp/aspose.page.xps.xpsmetadata/pagemediatype/pagemediatypeoption/
---
## PageMediaTypeOption class


[PageMediaType](../) 기능 옵션을 설명합니다.

```cpp
class PageMediaTypeOption : public Aspose::Page::XPS::XpsMetadata::Option,
                            public Aspose::Page::XPS::XpsMetadata::PageMediaType::IPageMediaTypeItem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | 옵션에 [IPageMediaTypeOptionItem](../ipagemediatypeoptionitem/) 인스턴스 배열을 추가합니다. |
| [Clone](./clone/)() | 이 옵션 인스턴스를 복제합니다. 복제 생성자에 대한 바로 가기입니다. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | 새 인스턴스를 생성합니다. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::SharedPtr\<PageMediaType::PageMediaTypeOption\>) | 이 옵션 인스턴스를 복제합니다. |
| [SetWeight](./setweight/)(int32_t) | **Weight** 점수 속성 값을 설정합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Archival](./archival/) | 아카이브 품질 미디어를 지정합니다. |
| static [AutoSelect](./autoselect/) | 미디어가 자동으로 선택되도록 지정합니다. |
| static [BackPrintFilm](./backprintfilm/) | 특수 백 프린팅 필름 매체를 지정합니다. |
| static [Bond](./bond/) | 표준 본드 매체를 지정합니다. |
| static [CardStock](./cardstock/) | 표준 카드 스톡 매체를 지정합니다. |
| static [Continous](./continous/) | 연속 공급 매체를 지정합니다. |
| static [EnvelopePlain](./envelopeplain/) | 표준 봉투 매체를 지정합니다. |
| static [EnvelopeWindow](./envelopewindow/) | 창문이 있는 봉투 매체를 지정합니다. |
| static [Fabric](./fabric/) | 패브릭 매체를 지정합니다. |
| static [HighResolution](./highresolution/) | 특수 고해상도 매체를 지정합니다. |
| static [Label](./label/) | 라벨 매체를 지정합니다. |
| static [MultiLayerForm](./multilayerform/) | 첨부된 다중 파트 양식 매체를 지정합니다. |
| static [MultiPartForm](./multipartform/) | 분리된 다중 파트 양식 매체를 지정합니다. |
| static [None](./none/) | 알 수 없거나 목록에 없는 매체를 지정합니다. |
| static [Photographic](./photographic/) | 표준 사진 매체를 지정합니다. |
| static [PhotographicFilm](./photographicfilm/) | 필름 사진 매체를 지정합니다. |
| static [PhotographicGlossy](./photographicglossy/) | 광택 사진 매체를 지정합니다. |
| static [PhotographicHighGloss](./photographichighgloss/) | 고광택 사진 매체를 지정합니다. |
| static [PhotographicMatte](./photographicmatte/) | 무광 사진 매체를 지정합니다. |
| static [PhotographicSatin](./photographicsatin/) | 새틴 사진 매체를 지정합니다. |
| static [PhotographicSemiGloss](./photographicsemigloss/) | 반광택 사진 매체를 지정합니다. |
| static [Plain](./plain/) | 표준 종이 매체를 지정합니다. |
| static [Screen](./screen/) | 연속 형태로 출력 디스플레이에 출력을 지정합니다. |
| static [ScreenPaged](./screenpaged/) | 페이지 형태로 출력 디스플레이에 출력을 지정합니다. |
| static [Stationary](./stationary/) | 특수 문구류 매체를 지정합니다. |
| static [TabStockFull](./tabstockfull/) | 미리 절단되지 않은 탭 스톡 매체를 지정합니다 (단일 탭). |
| static [TabStockPreCut](./tabstockprecut/) | 미리 절단된 탭 스톡 매체를 지정합니다 (다중 탭). |
| static [Transparency](./transparency/) | 투명 매체를 지정합니다. |
| static [TShirtTransfer](./tshirttransfer/) | 특수 티셔츠 전사 매체를 지정합니다. |
## 또 보기

* Class [Option](../../option/)
* Class [IPageMediaTypeItem](../ipagemediatypeitem/)
* Class [PageMediaType](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
