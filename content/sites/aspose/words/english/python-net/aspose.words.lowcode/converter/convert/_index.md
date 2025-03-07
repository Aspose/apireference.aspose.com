﻿---
title: Converter.convert method
linktitle: convert method
articleTitle: convert method
second_title: Aspose.Words for Python
description: "aspose.words.lowcode.Converter.convert method"
type: docs
weight: 10
url: /python-net/aspose.words.lowcode/converter/convert/
---

## convert(input_file, output_file) {#str_str}

Converts the given input document into the output document using specified input output file names and its extensions.


```python
def convert(self, input_file: str, output_file: str):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| input_file | str | The input file name. |
| output_file | str | The output file name. |

## convert(input_file, output_file, save_format) {#str_str_saveformat}

Converts the given input document into the output document using specified input output file names and the final document format.


```python
def convert(self, input_file: str, output_file: str, save_format: aspose.words.SaveFormat):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| input_file | str | The input file name. |
| output_file | str | The output file name. |
| save_format | [SaveFormat](../../../aspose.words/saveformat/) | The save format. |

## convert(input_file, output_file, save_options) {#str_str_saveoptions}

Converts the given input document into the output document using specified input output file names and save options.


```python
def convert(self, input_file: str, output_file: str, save_options: aspose.words.saving.SaveOptions):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| input_file | str | The input file name. |
| output_file | str | The output file name. |
| save_options | [SaveOptions](../../../aspose.words.saving/saveoptions/) | The save options. |

## convert(input_file, load_options, output_file, save_options) {#str_loadoptions_str_saveoptions}

Converts the given input document into the output document using specified input output file names its load/save options.


```python
def convert(self, input_file: str, load_options: aspose.words.loading.LoadOptions, output_file: str, save_options: aspose.words.saving.SaveOptions):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| input_file | str | The input file name. |
| load_options | [LoadOptions](../../../aspose.words.loading/loadoptions/) | The input document load options. |
| output_file | str | The output file name. |
| save_options | [SaveOptions](../../../aspose.words.saving/saveoptions/) | The save options. |

## convert(input_stream, output_stream, save_format) {#bytesio_bytesio_saveformat}

Converts the given input document into a single output document using specified input and output streams.


```python
def convert(self, input_stream: io.BytesIO, output_stream: io.BytesIO, save_format: aspose.words.SaveFormat):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| input_stream | io.BytesIO | The input stream. |
| output_stream | io.BytesIO | The output stream. |
| save_format | [SaveFormat](../../../aspose.words/saveformat/) | The save format. |

## convert(input_stream, output_stream, save_options) {#bytesio_bytesio_saveoptions}

Converts the given input document into a single output document using specified input and output streams.


```python
def convert(self, input_stream: io.BytesIO, output_stream: io.BytesIO, save_options: aspose.words.saving.SaveOptions):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| input_stream | io.BytesIO | The input streams. |
| output_stream | io.BytesIO | The output stream. |
| save_options | [SaveOptions](../../../aspose.words.saving/saveoptions/) | The save options. |

## convert(input_stream, load_options, output_stream, save_options) {#bytesio_loadoptions_bytesio_saveoptions}

Converts the given input document into a single output document using specified input and output streams.


```python
def convert(self, input_stream: io.BytesIO, load_options: aspose.words.loading.LoadOptions, output_stream: io.BytesIO, save_options: aspose.words.saving.SaveOptions):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| input_stream | io.BytesIO | The input streams. |
| load_options | [LoadOptions](../../../aspose.words.loading/loadoptions/) | The input document load options. |
| output_stream | io.BytesIO | The output stream. |
| save_options | [SaveOptions](../../../aspose.words.saving/saveoptions/) | The save options. |

## Examples

Shows how to convert documents with a single line of code.

```python
doc = MY_DIR + 'Document.docx'
aw.lowcode.Converter.convert(input_file=doc, output_file=ARTIFACTS_DIR + 'LowCode.Convert.pdf')
aw.lowcode.Converter.convert(input_file=doc, output_file=ARTIFACTS_DIR + 'LowCode.Convert.SaveFormat.rtf', save_format=aw.SaveFormat.RTF)
save_options = aw.saving.OoxmlSaveOptions()
save_options.password = 'Aspose.Words'
load_options = aw.loading.LoadOptions()
load_options.ignore_ole_data = True
aw.lowcode.Converter.convert(input_file=doc, load_options=load_options, output_file=ARTIFACTS_DIR + 'LowCode.Convert.LoadOptions.docx', save_options=save_options)
aw.lowcode.Converter.convert(input_file=doc, output_file=ARTIFACTS_DIR + 'LowCode.Convert.SaveOptions.docx', save_options=save_options)
```

Shows how to convert documents with a single line of code (Stream).

```python
with system_helper.io.FileStream(MY_DIR + 'Big document.docx', system_helper.io.FileMode.OPEN, system_helper.io.FileAccess.READ) as stream_in:
    with system_helper.io.FileStream(ARTIFACTS_DIR + 'LowCode.ConvertStream.1.docx', system_helper.io.FileMode.CREATE, system_helper.io.FileAccess.READ_WRITE) as stream_out:
        aw.lowcode.Converter.convert(input_stream=stream_in, output_stream=stream_out, save_format=aw.SaveFormat.DOCX)
    save_options = aw.saving.OoxmlSaveOptions()
    save_options.password = 'Aspose.Words'
    load_options = aw.loading.LoadOptions()
    load_options.ignore_ole_data = True
    with system_helper.io.FileStream(ARTIFACTS_DIR + 'LowCode.ConvertStream.2.docx', system_helper.io.FileMode.CREATE, system_helper.io.FileAccess.READ_WRITE) as stream_out:
        aw.lowcode.Converter.convert(input_stream=stream_in, load_options=load_options, output_stream=stream_out, save_options=save_options)
    with system_helper.io.FileStream(ARTIFACTS_DIR + 'LowCode.ConvertStream.3.docx', system_helper.io.FileMode.CREATE, system_helper.io.FileAccess.READ_WRITE) as stream_out:
        aw.lowcode.Converter.convert(input_stream=stream_in, output_stream=stream_out, save_options=save_options)
```

## See Also

* module [aspose.words.lowcode](../../)
* class [Converter](../)

