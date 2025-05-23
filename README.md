# 🧑‍💻 Git 실습활동: 계산기 미니프로젝트

## 📋 프로젝트 개요

- **목표:** Git 및 GitHub 협업 실습을 통해 기본적인 협업 프로세스와 브랜치 전략을 익히기.
- **과제:** 4인 1조로 구성된 팀별로 계산기 프로젝트를 개발합니다.
- **개발 언어:** 자유 선택
- **Git 컨벤션:** 팀별로 자유롭게 정하여 적용 (얼렁뚱땅 금지)

---

## 🏗️ 레포지토리 구조 및 작업 방식

```
Github_Mini_Practice/
├── team1/
│   └── (팀1의 프로젝트 파일)
├── team2/
│   └── (팀2의 프로젝트 파일)
├── team3/
│   └── (팀3의 프로젝트 파일)
└── ...
```

- `❗️주의❗️` 각 팀은 `team1`, `team2`, ...와 같이 `본인 팀 폴더 내에서만` 작업해야합니다.

---

## 🚦 브랜치 전략 및 협업 프로세스

1. **메인 브랜치 구조**

   - `main`: 최종 결과물 - 운영진이 합칠 예정
   - `develop`: 개발 통합 브랜치 - 팀 작업 통과시 PR 요청 후 합칠 예정
   - `teamX`: 팀별 작업 브랜치 (예: `team1`, `team2` ...)
   - `issue 이슈번호`: 세부 기능 개발 브랜치 (예시: `issue/#1_add` , `issue/#1` , `Feat/#2_minus` , `Feat/#2` 등)

2. **작업 흐름**
   1. 팀별로 원격 브랜치 연결 후 Pull 받은 뒤 동기화 후 시작
   1. 팀별로 `teamX` 브랜치 생성 후 pull 받은 폴더에서 `teamX` 폴더 생성 후 작업
   1. 각 기능(예: 더하기, 빼기, 곱셈, 나누기)은 `issue/이슈번호` 브랜치에서 개발
   1. 기능 개발 완료 후 `teamX` 브랜치로 Pull Request(풀리퀘) 및 머지 - 코드 리뷰 필수 모르면 질문
   1. 팀별 프로젝트 완성 후, 운영진 확인을 거쳐 `develop` 브랜치로 머지
   1. 최종적으로 `main` 브랜치에 반영

---

## 🛠️ 실습 진행 방법

1. **레포지토리 Fork 및 Clone**

   - 기존 레포지토리(remote) 연결 후, `pull`로 최신 코드 동기화

2. **팀별 폴더에서 작업**

   - 각 팀은 본인 팀 폴더 내에서만 파일 생성 및 수정

3. **기능 분배 예시**

   - 팀원 1: 더하기 모듈
   - 팀원 2: 빼기 모듈
   - 팀원 3: 곱셈 모듈
   - 팀원 4: 나누기 모듈

4. **로컬에서 개발 후 커밋 & 푸시**

   - 각 기능별 브랜치에서 개발 및 커밋
   - 원격 저장소로 푸시

5. **Pull Request 및 코드 리뷰**

   - 기능 개발 완료 시, 팀 브랜치로 Pull Request 생성
   - 팀원 간 코드 리뷰 후 머지

6. **운영진 확인 및 develop 브랜치 머지**
   - 이슈 브랜치는 각 팀원들끼리 별로 코드 리뷰 후 팀 브랜치에 머지
   - 팀 브랜치가 완성되면 운영진이 확인 후 `develop` 브랜치에 머지

---

## 💡 기타 규칙

- **커밋 메시지 컨벤션**: 팀별로 자유롭게 정하되, 일관성 있게 작성
- **코드 스타일**: 팀 내에서 합의한 컨벤션을 따름
- **이슈 관리**: 각 기능별로 GitHub Issue를 생성하여 관리 권장

---

## 🙌 협업을 위한 팁

- 자주 Pull 받아서 동기화하세요!
- 커밋 메시지는 기능 및 내용을 잘 알아듣게 작성하세요.
- 깃 컨벤션을 정한 뒤 팀원끼리 꼭 지켜주세요.
- 코드 리뷰를 통해 서로의 코드를 이해하고 개선점을 찾아보세요.
- 궁금한 점은 팀원 및 운영진에게 적극적으로 질문하세요.

---
