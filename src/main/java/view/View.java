package view;

import repository.*;


public abstract class View {
    public static final RepositoryBook repositoryBook =new RepositoryBook();

    public static final RepositoryCourse repositoryCourse=new RepositoryCourse();

    public static final RepositoryDuration repositoryDuration= new RepositoryDuration();

    public static final RepositoryPermission repositoryPermission = new RepositoryPermission();

    public static final RepositoryRole repositoryRole=new RepositoryRole();

    public static final RepositoryStudent repositoryStudent = new RepositoryStudent();

    public static final RepositoryUser repositoryUser=new RepositoryUser();
}