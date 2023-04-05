---
title: IMultiPageDevice.OpenPage
second_title: Aspose.Page for .NET API リファレンス
description: IMultiPageDevice 方法. ページ レンダリングの前にデバイスの必要な準備を行います
type: docs
weight: 40
url: /ja/net/aspose.page/imultipagedevice/openpage/
---
## OpenPage(string) {#openpage_1}

ページ レンダリングの前にデバイスの必要な準備を行います。

```csharp
public bool OpenPage(string title)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| title | String | ページのタイトル。 |

### 戻り値

ページが要求された範囲内にある場合は true、そうでない場合は false. 指定されたページ番号の配列をレンダリングできるデバイスで使用されます.

### 関連項目

* interface [IMultiPageDevice](../)
* 名前空間 [Aspose.Page](../../imultipagedevice/)
* 組み立て [Aspose.Page](../../../)

---

## OpenPage(float, float) {#openpage}

各ページをレンダリングする前に、デバイスの必要な準備を行います.

```csharp
public bool OpenPage(float width, float height)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| width | Single | ページの幅。 |
| height | Single | ページの高さ。 |

### 戻り値

開いているページに選択したページ番号の範囲内の番号がある場合は true を返し、そうでない場合は false を返します。

### 関連項目

* interface [IMultiPageDevice](../)
* 名前空間 [Aspose.Page](../../imultipagedevice/)
* 組み立て [Aspose.Page](../../../)


