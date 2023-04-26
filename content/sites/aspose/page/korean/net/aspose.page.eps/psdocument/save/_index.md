---
title: PsDocument.Save
second_title: .NET API 참조용 Aspose.Page
description: PsDocument 방법. 장치에 PS/EPS 파일을 저장합니다.
type: docs
weight: 220
url: /ko/net/aspose.page.eps/psdocument/save/
---
## Save(Device, SaveOptions) {#save_1}

장치에 PS/EPS 파일을 저장합니다.

```csharp
public override void Save(Device device, SaveOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| device | Device | 출력 장치. |
| options | SaveOptions | 변환 중에 발생한 오류의 출력을 지정하는 플래그를 포함합니다. |

### 또한보십시오

* class [Device](../../../aspose.page/device/)
* class [SaveOptions](../../../aspose.page/saveoptions/)
* class [PsDocument](../)
* 네임스페이스 [Aspose.Page.EPS](../../psdocument/)
* 집회 [Aspose.Page](../../../)

---

## Save(Stream) {#save_2}

주어진 세이브[`PsDocument`](../) EPS 파일로. 이 메서드는 XMP 메타데이터를 업데이트한 후에만 사용됩니다. 업데이트된 기존 메타데이터 또는 GetMetadata 메서드를 호출하는 동안 생성된 새 메타데이터로 초기 EPS 파일을 저장합니다. 마지막 경우 필요한 모든 PostScript 코드와 EPS 주석이 추가됩니다.

```csharp
public void Save(Stream epsStream)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| epsStream | Stream | 출력 EPS 파일의 스트림. |

### 또한보십시오

* class [PsDocument](../)
* 네임스페이스 [Aspose.Page.EPS](../../psdocument/)
* 집회 [Aspose.Page](../../../)

---

## Save() {#save}

주어진 세이브[`PsDocument`](../)EPS 파일로. 이 메서드는 PsDocument가 처음부터 생성된 경우에만 사용됩니다.

```csharp
public void Save()
```

### 또한보십시오

* class [PsDocument](../)
* 네임스페이스 [Aspose.Page.EPS](../../psdocument/)
* 집회 [Aspose.Page](../../../)


