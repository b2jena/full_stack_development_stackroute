# echo "enter the project name";
# read proj;
# ln -s $(pwd)/$proj repo
# rm -rf .git;
# git init;
# echo "enter the remote url";
# read origin;
# git remote add origin $origin;
# git add .;
# git commit -am "initial commit";
# git push origin master;

echo 'test.sh' >> .gitignore
rm -rf .git;
git init;
current=`pwd`;
base=`basename "$current"`;
origin="https://Deepan.Ramalingam123:Stack%400987@gitlab-cts.stackroute.in/stack_jfse_prereq_corejavads_exercises/$base.git";
# echo "enter the remote url";
# read origin;
git remote add origin $origin;
git add .;
git commit -am "initial commit";
git push origin master;

# echo $origin;


