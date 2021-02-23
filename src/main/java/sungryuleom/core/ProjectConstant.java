package sungryuleom.core;

/**
 * 프로젝트 상수
 */
public final class ProjectConstant {
    public static final String BASE_PACKAGE = "sungryuleom"; //코드 이름 기본 패키지를 생성 할 경우, 그의 회사의 프로젝트 수정 (주에 따라 : 수동으로 기본 패키지 구성을 변경 한 후 프로젝트 src 디렉토리 경로를 수정해야의 그것은 동일하게 유지됩니다. 그렇지 않으면 클래스가 발견되지 않습니다)
    public static final String MODEL_PACKAGE = BASE_PACKAGE + ".model";// 자신의 패키지 모델 내에서 생성
    public  static  final  String  MAPPER_PACKAGE  =  BASE_PACKAGE  +  ".dao" ; // 생성 된 Mapper 패키지
    public  static  final  String  SERVICE_PACKAGE  =  BASE_PACKAGE  +  ".service" ; // 생성 된 Service가 위치한 패키지
    public  static  final  String  SERVICE_IMPL_PACKAGE  =  SERVICE_PACKAGE  +  ".impl" ; // 생성 된 ServiceImpl은 패키지 내에 있습니다.
    public  static  final  String  CONTROLLER_PACKAGE  =  BASE_PACKAGE  +  ".web" ; // 생성 된 Controller가 패키지 내에 있습니다.
    public  static  final  String  MAPPER_INTERFACE_REFERENCE  =  BASE_PACKAGE  +  ".core.Mapper" ; // Mapper Plugin 기본 인터페이스의 정규화 된 이름입니다.

}
