---
title: Aspose::TeX::TeXJob::TeXJob constructor
linktitle: TeXJob
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::TeXJob::TeXJob constructor. Creates a TeX job for running the engine in production mode to typeset a TeX file in C++.'
type: docs
weight: 100
url: /cpp/aspose.tex/texjob/texjob/
---
## TeXJob::TeXJob(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Device\>, System::SharedPtr\<TeXOptions\>) constructor


Creates a [TeX](../../) job for running the engine in production mode to typeset a [TeX](../../) file.

```cpp
ASPOSE_TEX_SHARED_API Aspose::TeX::TeXJob::TeXJob(System::SharedPtr<System::IO::Stream> stream, System::SharedPtr<Presentation::Device> device, System::SharedPtr<TeXOptions> options)
```


| Parameter | Type | Description |
| --- | --- | --- |
| stream | System::SharedPtr\<System::IO::Stream\> | The stream containing the [TeX](../../) file. |
| device | System::SharedPtr\<Presentation::Device\> | The device defining output representation. |
| options | System::SharedPtr\<TeXOptions\> | [TeX](../../) engine run options. |

## See Also

* Class [Device](../../../aspose.tex.presentation/device/)
* Class [TeXOptions](../../texoptions/)
* Class [TeXJob](../)
* Namespace [Aspose::TeX](../../)
* Library [Aspose.TeX for C++](../../../)
## TeXJob::TeXJob(System::String, System::SharedPtr\<Presentation::Device\>, System::SharedPtr\<TeXOptions\>) constructor


Creates a [TeX](../../) job for running the engine in production mode to typeset a [TeX](../../) file.

```cpp
ASPOSE_TEX_SHARED_API Aspose::TeX::TeXJob::TeXJob(System::String path, System::SharedPtr<Presentation::Device> device, System::SharedPtr<TeXOptions> options)
```


| Parameter | Type | Description |
| --- | --- | --- |
| path | System::String | The path to the [TeX](../../) file. |
| device | System::SharedPtr\<Presentation::Device\> | The device defining output representation. |
| options | System::SharedPtr\<TeXOptions\> | [TeX](../../) engine run options. |

## See Also

* Class [Device](../../../aspose.tex.presentation/device/)
* Class [TeXOptions](../../texoptions/)
* Class [TeXJob](../)
* Namespace [Aspose::TeX](../../)
* Library [Aspose.TeX for C++](../../../)
## TeXJob::TeXJob(System::SharedPtr\<Presentation::Device\>, System::SharedPtr\<TeXOptions\>) constructor


Creates a [TeX](../../) job for running the engine in production mode to typeset a [TeX](../../) document. The engine will prompt the file name as soon as it starts. Thus this run is supposed to be interactive.

```cpp
ASPOSE_TEX_SHARED_API Aspose::TeX::TeXJob::TeXJob(System::SharedPtr<Presentation::Device> device, System::SharedPtr<TeXOptions> options)
```


| Parameter | Type | Description |
| --- | --- | --- |
| device | System::SharedPtr\<Presentation::Device\> | The device defining output representation. |
| options | System::SharedPtr\<TeXOptions\> | [TeX](../../) engine run options. |

## See Also

* Class [Device](../../../aspose.tex.presentation/device/)
* Class [TeXOptions](../../texoptions/)
* Class [TeXJob](../)
* Namespace [Aspose::TeX](../../)
* Library [Aspose.TeX for C++](../../../)
